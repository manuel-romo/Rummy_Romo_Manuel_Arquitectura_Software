
package comandos.solicitud;

import interfaces.IComando;


public class ComandoAgregarFichasJugador implements IComando {
    
    private Integer[] idsFichas;
    private final String type = "ComandoAgregarFichasJugador";
    private String nombreJugador;

    public ComandoAgregarFichasJugador(Integer[] idFichas, String nombreJugador) {
        this.idsFichas = idFichas;
        this.nombreJugador = nombreJugador;
    }

    public Integer[] getIdsFichas() {
        return idsFichas;
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
