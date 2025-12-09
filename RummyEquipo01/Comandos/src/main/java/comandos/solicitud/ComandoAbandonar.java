
package comandos.solicitud;

import interfaces.IComando;


public class ComandoAbandonar implements IComando{
    private String type = "ComandoAbandonar";
    private String nombreJugador;

    public ComandoAbandonar(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    @Override
    public String getTipo() {
        return type;
    }

    @Override
    public String getNombreJugador() {
        return nombreJugador;
    }
}
