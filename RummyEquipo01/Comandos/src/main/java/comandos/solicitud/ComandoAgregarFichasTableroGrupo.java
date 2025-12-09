
package comandos.solicitud;

import interfaces.IComando;

/**
 *
 * Comando que agrega fichas al tablero y al grupo del jugador indicado.
 * 
 * @author pedro
 */
public class ComandoAgregarFichasTableroGrupo implements IComando {
    private Integer[] idsFichas;
    private Integer[] idsFichasGrupo;
    private final String type = "ComandoAgregarFichasTableroGrupo";
    private String nombreJugador;

    public ComandoAgregarFichasTableroGrupo(Integer[] idFichas, Integer[] idFichasGrupo, String nombreJugador) {
        this.idsFichas = idFichas;
        this.idsFichasGrupo = idFichasGrupo;
        this.nombreJugador = nombreJugador;
    }

    public Integer[] getIdsFichas() {
        return idsFichas;
    }

    public Integer[] getIdsFichasGrupo() {
        return idsFichasGrupo;
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
