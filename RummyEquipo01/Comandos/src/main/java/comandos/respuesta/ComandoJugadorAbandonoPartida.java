
package comandos.respuesta;

import interfaces.IComando;


public class ComandoJugadorAbandonoPartida implements IComando{
    
    private String type = "ComandoJugadorAbandonoPartida";
    private String nombreJugador;
    private String mensaje;

    public ComandoJugadorAbandonoPartida(String nombreJugador, String mensaje) {
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
