
package comandos.respuesta;

import interfaces.IComando;


public class ComandoRespuestaAbandonar implements IComando{
    
    private String type = "ComandoRespuestaAbandonar";
    private String nombreJugador;
    private String mensaje;

    public ComandoRespuestaAbandonar(String nombreJugador, String mensaje) {
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
