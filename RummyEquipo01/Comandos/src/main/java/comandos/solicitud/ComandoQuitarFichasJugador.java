
package comandos.solicitud;

import interfaces.IComando;

/**
 *
 * Comando que pide quitar las fichas indicadas del jugador.
 * 
 * @author pedro
 */
public class ComandoQuitarFichasJugador implements IComando{
    private String type = "ComandoQuitarFichasJugador";
    private String nombreJugador;
    
    private Integer[] idsFichas;

    public ComandoQuitarFichasJugador(Integer[] idsFichas, String nombreJugador) {
        this.idsFichas = idsFichas;
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
