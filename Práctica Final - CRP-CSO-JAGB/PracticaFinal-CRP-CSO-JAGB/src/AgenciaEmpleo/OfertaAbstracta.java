/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase OfertaAbstracta - Patrón Bridge
 */
package AgenciaEmpleo;

/**
 * Abstracción: Define la interfaz de la abstracción y mantiene una referencia al objeto Implementador. 
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class OfertaAbstracta {
    
    private OfertaImp imp;

    /**
     * Busca la oferta
     * @param of
     * @return  oferta
     */
    public boolean buscar(Oferta of){
    return imp.ordena(of);
    } 
    /**
     * 
     * @return imp
     */
    public OfertaImp getImp() {
        return imp;
    }
    /**
     * 
     * @param imp
     */
    public void setImp(OfertaImp imp) {
        this.imp = imp;
    }
    
    
}
