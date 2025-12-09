
package comandos.respuesta;

import interfaces.IComando;

/**
 *
 * @author Romo López Manuel
 * ID: 00000253080
 * 
 */
public class ComandoRespuestaIniciarJuego implements IComando{
    
    private String type = "ComandoRespuestaIniciarJuego";
    private String nombreJugador;
    private String mensaje;

    public ComandoRespuestaIniciarJuego(String nombreJugador, String mensaje) {
        this.nombreJugador = nombreJugador;
        this.mensaje = mensaje;
    }

    @Override
    public String getTipo() {
        return type;
    }

    public String getMensaje() {
        return mensaje;
    } 

    @Override
    public String getNombreJugador() {
        return nombreJugador;
    }
    
}
