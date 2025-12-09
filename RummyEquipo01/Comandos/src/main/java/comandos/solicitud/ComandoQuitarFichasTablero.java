
package comandos.solicitud;

import interfaces.IComando;

/**
 *
 * Comando que solicita quitar fichas del tablero y del grupo indicado para un jugador.
 * 
 * @author pedro
 */
public class ComandoQuitarFichasTablero implements IComando{
    private Integer[] idsFichas;
    private final String type = "ComandoQuitarFichasTablero";
    private String nombreJugador;

    public ComandoQuitarFichasTablero(Integer[] idFichas, String nombreJugador) {
        this.idsFichas = idFichas;
        this.nombreJugador = nombreJugador;
    }

    public Integer[] getIdsFichas() {
        return idsFichas;
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
