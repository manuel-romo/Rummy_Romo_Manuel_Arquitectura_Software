
package comandos.solicitud;

import interfaces.IComando;


public class ComandoSolicitarFin implements IComando{
    
    private String type = "ComandoSolicitarFin";
    private String nombreJugador;

    public ComandoSolicitarFin(String nombreJugador) {
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
