
package serializador;

import com.google.gson.Gson;
import comandos.envolventes.ComandoEnvolvente;
import interfaces.IFiltro;
import interfaces.IComando;

/**
 *
 * @author pedro
 */
public class Serializador implements IFiltro {

    private IFiltro filtroSiguiente;
    private final Gson gson = new Gson();
    
    private String serializarAccion(IComando command) {
        return gson.toJson(command);
    }

    public void setFiltroSiguiente(IFiltro filtroSiguiente) {
        this.filtroSiguiente = filtroSiguiente;
    }  

    /**
     * Método de IFiltro que cuando se le llama, envia la acción al componente de directorio para que se ajuste su direcion. 
     * Si hay un filtro siguiente este se ejecuta.  
     * @param comando instancia de comando 
     */
    @Override
    public void ejecutar(IComando comando) {
        String accion = serializarAccion(comando);
        IComando comandoEnvolvente = new ComandoEnvolvente(accion,comando.getNombreJugador());
       

        if (filtroSiguiente != null) {
            filtroSiguiente.ejecutar(comandoEnvolvente);
        }
    }
}
