
package comandos.solicitud;

import interfaces.IComando;

/**
 * Comando que indica que un jugador ha terminado su turno.
 * 
 * 
 * @author pedro
 */
public class ComandoTerminarTurno implements IComando{
    private final String type = "ComandoTerminarTurno";
    private String nombreJugador;

    public ComandoTerminarTurno(String nombreJugador) {
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
