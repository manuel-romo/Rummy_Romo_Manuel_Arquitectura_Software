
package comandos.respuesta;

import enumeradores.TipoComando;
import dto.TableroDTO;
import interfaces.IComando;

/**
 *
 * Comando de respuesta que envía el tablero restablecido al jugador.
 * 
 * @author pedro
 */
public class ComandoRespuestaReestablecer implements IComando {
    private TableroDTO tablero;
    private final String type = "ComandoReestablecerRespuesta";
    private String nombreJugador;

    public ComandoRespuestaReestablecer(TableroDTO tablero, String nombreJugador) {
        this.tablero = tablero;
        this.nombreJugador = nombreJugador;
    }

    public TableroDTO getTablero() {
        return tablero;
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
