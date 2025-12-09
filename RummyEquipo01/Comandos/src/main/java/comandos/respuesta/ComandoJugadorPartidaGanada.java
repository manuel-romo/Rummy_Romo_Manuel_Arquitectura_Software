
package comandos.respuesta;

import interfaces.IComando;


public class ComandoJugadorPartidaGanada implements IComando{
    
    private String type = "ComandoJugadorPartidaGanada";
    private String nombreJugador;
    private String mensaje;

    public ComandoJugadorPartidaGanada(String nombreJugador, String mensaje) {
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
