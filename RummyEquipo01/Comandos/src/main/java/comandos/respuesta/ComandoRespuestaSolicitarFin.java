
package comandos.respuesta;

import interfaces.IComando;


public class ComandoRespuestaSolicitarFin implements IComando{
    
    private String nombreJugador;
    private final String type = "ComandoRespuestaSolicitarFin";
    private String mensaje;

    public ComandoRespuestaSolicitarFin(String nombreJugador, String mensaje) {
        this.nombreJugador = nombreJugador;
        this.mensaje = mensaje;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public String getMensaje() {
        return mensaje;
    }
    
    @Override
    public String getTipo() {
        return type;
    }
    
}
