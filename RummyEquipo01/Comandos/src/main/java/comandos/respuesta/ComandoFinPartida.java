
package comandos.respuesta;

import interfaces.IComando;


public class ComandoFinPartida implements IComando{
    
    private String type = "ComandoFinPartida";
    
    private String nombreJugador;

    public ComandoFinPartida(String nombreJugador) {
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
