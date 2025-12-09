
package comandos.solicitud;

import interfaces.IComando;

/**
 *
 * Comando que solicita restablecer el tablero para el jugador indicado.
 * 
 * @author pedro
 */
public class ComandoReestablecerTablero implements IComando{
    private final String type = "ComandoReestablecerTablero";
    private String nombreJugador;
    
    public ComandoReestablecerTablero(String nombreJugador) {
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
