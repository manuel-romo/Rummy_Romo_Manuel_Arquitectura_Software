
package comandos.solicitud;

import interfaces.IComando;

/**
 *
 * @author Romo López Manuel
 * ID: 00000253080
 */
public class ComandoSeleccionarFichasTablero implements IComando{

    private String type = "ComandoSeleccionarFichasTablero";
    
    private String nombreJugador;
    private Integer[] idsFichas;

    public ComandoSeleccionarFichasTablero(Integer[] idFichas, String nombreJugador) {
        this.idsFichas = idFichas;
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

    public Integer[] getIdsFichas() {
        return idsFichas;
    }
    
}
