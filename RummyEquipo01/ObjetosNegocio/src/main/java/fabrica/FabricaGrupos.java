
package fabrica;

import excepciones.RummyException;
import java.util.List;
import negocio.Ficha;
import negocio.Grupo;
import negocio.GrupoColores;
import negocio.GrupoSecuencia;


public class FabricaGrupos {
    
    public static Grupo crearGrupo(int numeroGrupo, List<Ficha> fichas, boolean primerTurno, int maximoNumeroFicha) throws RummyException{
        

        Grupo.validarCreacionGrupo(fichas, primerTurno, maximoNumeroFicha);

        try{
            
            Grupo.validarGrupoColores(fichas);
            
            Grupo grupoColores = new GrupoColores(numeroGrupo, fichas, primerTurno);
            
            return grupoColores;
            
        } catch(RummyException ex){}
        
        
        try{
            
            Grupo.validarGrupoSecuencia(fichas);
            
            Grupo grupoSecuencia = new GrupoSecuencia(numeroGrupo, fichas, primerTurno);
            
            return grupoSecuencia;
            
        } catch(RummyException ex){}
        
        return null;
        
    }
    
}
