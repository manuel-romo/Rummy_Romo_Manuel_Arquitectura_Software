
package comandos.respuesta;

import interfaces.IComando;

/**
 * Comando de respuesta que indica que el tablero es inválido para el jugador.
 * 
 * @author pedro
 */
public class ComandoTableroInvalido implements IComando {

    private final String type = "ComandoTableroInvalido";
    private String nombreJugador;
    private String mensaje;

    public ComandoTableroInvalido(String nombreJugador, String mensaje) {
        this.nombreJugador = nombreJugador;
        this.mensaje = mensaje;
    }

    @Override
    public String getTipo() {
        return type;
    }

    @Override
    public String getNombreJugador() {
        return nombreJugador;
    }

    public String getMensaje() {
        return mensaje;
    }

}
