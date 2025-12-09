
package comandos.respuesta;

import interfaces.IComando;

/**
 *
 * @author Romo López Manuel
 * ID: 00000253080
 */
public class ComandoActualizarJugadoresInicioJuego implements IComando{
    
    private String type = "ComandoActualizarJugadoresInicioJuego";
    private String nombreJugador;
    private int cantidadJugadoresInicioJuego;

    public ComandoActualizarJugadoresInicioJuego(String nombreJugador, int cantidadJugadoresInicioJuego) {
        this.nombreJugador = nombreJugador;
        this.cantidadJugadoresInicioJuego = cantidadJugadoresInicioJuego;
    }

    @Override
    public String getTipo() {
        return type;
    }

    public int getCantidadJugadoresInicioJuego() {
        return cantidadJugadoresInicioJuego;
    }

    @Override
    public String getNombreJugador() {
        return nombreJugador;
    }
    
}
