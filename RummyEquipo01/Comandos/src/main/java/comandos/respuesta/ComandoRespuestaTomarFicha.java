
package comandos.respuesta;

import dtos.TableroDTO;
import interfaces.IComando;


public class ComandoRespuestaTomarFicha implements IComando{
    
    private TableroDTO tablero;
    private boolean movimientoValido;
    private final String type = "ComandoRespuestaTomarFicha";
    private String nombreJugador;
    
    public ComandoRespuestaTomarFicha(TableroDTO tablero, boolean movimientoValido, String nombreJugador) {
        this.tablero = tablero;
        this.movimientoValido = movimientoValido;
        this.nombreJugador = nombreJugador;
    }

    public TableroDTO getTablero() {
        return tablero;
    }

    public boolean isMovimientoValido() {
        return movimientoValido;
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
