
package comandos.respuesta;

import interfaces.IComando;


public class ComandoRespuestaConfirmacionSolicitarFin implements IComando{
    
    private String type = "ComandoRespuestaConfirmacionSolicitarFin";
    private String nombreJugador;
    private String mensaje;

    public ComandoRespuestaConfirmacionSolicitarFin(String nombreJugador, String mensaje) {
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
