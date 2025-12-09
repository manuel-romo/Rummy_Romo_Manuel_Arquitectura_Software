
package comandos.envolventes;

import interfaces.IComando;

/**
 *
 * Comando envolvente que lleva un mensaje serializado junto con el nombre del jugador que lo envió.
 * 
 * @author pedro
 */
public class ComandoEnvolvente implements IComando {

    private final String type = "ComandoEnvolvente";
    private String mensajeSerializado;
    private String nombreJugador;

    public ComandoEnvolvente(String mensajeSerializado, String nombreJugador) {
        this.mensajeSerializado = mensajeSerializado;
        this.nombreJugador = nombreJugador;
    }

    @Override
    public String getTipo() {
        return type;
    }

    public String getMensajeSerializado() {
        return mensajeSerializado;
    }

    @Override
    public String getNombreJugador() {
        return nombreJugador;
    }
}
