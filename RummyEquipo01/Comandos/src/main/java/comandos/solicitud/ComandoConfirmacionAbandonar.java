
package comandos.solicitud;

import interfaces.IComando;


public class ComandoConfirmacionAbandonar implements IComando{
    
    private String nombreJugador;
    private final String type = "ComandoConfirmacionAbandonar";
    private boolean confirmacion;

    public ComandoConfirmacionAbandonar(String nombreJugador, boolean confirmacion) {
        this.nombreJugador = nombreJugador;
        this.confirmacion = confirmacion;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public boolean isConfirmacion() {
        return confirmacion;
    }

    @Override
    public String getTipo() {
        return type;
    }
    
}
