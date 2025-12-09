
package comandos.directorio;

import interfaces.IComando;


public class ComandoAgregarDireccionJugador implements IComando{
    
    private final String type = "ComandoAgregarDireccionJugador";
    private String[] direccion;
    private String nombreJugador;

    public ComandoAgregarDireccionJugador(String[] direccion, String nombreJugador) {
        this.direccion = direccion;
        this.nombreJugador = nombreJugador;
    }

    @Override
    public String getTipo() {
        return type;
    }

    public String[] getDireccion() {
        return direccion;
    }

    @Override
    public String getNombreJugador() {
        return nombreJugador;
    }
    
}
