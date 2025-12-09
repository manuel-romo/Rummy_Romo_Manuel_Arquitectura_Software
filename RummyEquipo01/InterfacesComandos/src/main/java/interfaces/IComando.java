
package interfaces;

/**
 * Interfaz de Command para implementar en comandos concretos.
 * @author Juan Heras
 */
public interface IComando {
    
    abstract String getTipo();
    
    abstract String getNombreJugador();
}
