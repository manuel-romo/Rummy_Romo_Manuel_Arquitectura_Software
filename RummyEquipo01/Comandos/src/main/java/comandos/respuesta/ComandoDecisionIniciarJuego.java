
package comandos.respuesta;

import interfaces.IComando;

/**
 *
 * @author Romo López Manuel
 * ID: 00000253080
 * 
 */
public class ComandoDecisionIniciarJuego implements IComando{
    
    private String type = "ComandoDecisionIniciarJuego";
    private String nombreJugador;
    private String mensaje;
    private boolean decision;

    public ComandoDecisionIniciarJuego(String nombreJugador, String mensaje, boolean decision) {
        this.nombreJugador = nombreJugador;
        this.mensaje = mensaje;
        this.decision = decision;
    }

    @Override
    public String getTipo() {
        return type;
    }

    public String getMensaje() {
        return mensaje;
    } 

    public boolean isDecision() {
        return decision;
    }

    @Override
    public String getNombreJugador() {
        return nombreJugador;
    }
    
    
}
