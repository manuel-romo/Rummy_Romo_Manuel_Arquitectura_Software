package directorioServidor;

import comandos.envolventes.ComandoEnvolvente;
import interfaces.IDispatcher;
import interfaces.IFiltro;
import interfaces.IComando;

/**
 *
 * @author pedro
 * 
 * Filtro que recibe un comando envolvente, le saca el mensaje ya serializado
 * y se lo pasa al dispatcher para enviarlo.
 * 
 */
public class DirectorioServidor implements IFiltro {

    private String[] direccion;
    private IDispatcher dispatcher;

    public DirectorioServidor(String[] direccion) {
        this.direccion = direccion;
    }

    @Override
    public void ejecutar(IComando comando) {
        ComandoEnvolvente envolvente = (ComandoEnvolvente) comando;
        dispatcher.agregarMensaje(envolvente.getMensajeSerializado(), direccion);
    }

    public void setDispatcher(IDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }
    
    

}
