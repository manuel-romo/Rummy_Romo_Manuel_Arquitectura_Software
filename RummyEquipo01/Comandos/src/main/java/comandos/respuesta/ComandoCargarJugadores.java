
package comandos.respuesta;

import dtos.JugadorInicioPartidaDTO;
import java.util.List;
import interfaces.IComando;

/**
 *
 * @author Romo López Manuel
 * ID: 00000253080
 * 
 */
public class ComandoCargarJugadores implements IComando{
    
    private String type = "ComandoCargarJugadores";
    private String nombreJugador;
    private List<JugadorInicioPartidaDTO> jugadores;

    public ComandoCargarJugadores(String nombreJugador, List<JugadorInicioPartidaDTO> jugadores) {
        this.nombreJugador = nombreJugador;
        this.jugadores = jugadores;
    }

    @Override
    public String getTipo() {
        return type;
    }

    public List<JugadorInicioPartidaDTO> getJugadores() {
        return jugadores;
    }
    
    @Override
    public String getNombreJugador() {
        return nombreJugador;
    }
    
}
