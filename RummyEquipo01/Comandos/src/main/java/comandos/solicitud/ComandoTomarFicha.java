
package comandos.solicitud;

import interfaces.IComando;


public class ComandoTomarFicha implements IComando{
    
    private final String type = "ComandoTomarFicha";
    private String nombreJugador;
    
    public ComandoTomarFicha(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    @Override
    public String getTipo() {
        return type;
    }

    @Override
    public String getNombreJugador() {
        return nombreJugador;
    }
}
