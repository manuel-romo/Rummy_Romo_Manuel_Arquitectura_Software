
package comandos.solicitud;

import interfaces.IComando;

/**
 *
 * Comando que indica que el turno debe cambiar al jugador especificado.
 * 
 * @author pedro
 */
public class ComandoCambiarTurnoSerializado implements IComando{
    private String nombreJugador;
    private final String type = "ComandoCambiarTurnoSerializado";

    public ComandoCambiarTurnoSerializado(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    @Override
    public String getTipo() {
        return type;
    }
    
    
}
