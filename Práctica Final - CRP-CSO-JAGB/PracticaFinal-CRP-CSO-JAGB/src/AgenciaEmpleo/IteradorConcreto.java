/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase IteradorConcreto : Patron Iterator
 */
package AgenciaEmpleo;

/**
 * IteradorConcreto: implementa la interfaz Iterador. 
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class IteradorConcreto implements Iterador {

    // Referencia al agregado concreto.
    private AgregadoConcreto agregado;
    // Indica la posición actual en la lista.
    private int indice = 0;

    /**
     * Constructor.
     * @param agregado Agregado concreto.
     */
    public IteradorConcreto(AgregadoConcreto agregado) {
        this.agregado = agregado;
    }

    @Override
    public Object primero() throws IndexOutOfBoundsException {
        Object objeto = null;
        if (agregado.elementos.length != 0) {
            indice = 0;
            objeto = agregado.elementos[0];
        } else {
            throw new IndexOutOfBoundsException();
        }
        return objeto;
    }

    @Override
    public Object siguiente() throws IndexOutOfBoundsException {
        Object objeto = null;
        if (indice < agregado.elementos.length) {
            objeto = agregado.elementos[indice];
            indice++;
            
        } //else {
           // throw new IndexOutOfBoundsException();
        //}
        return objeto;
    }

    @Override
    public Object anterior() throws IndexOutOfBoundsException {
        Object objeto = null;
        if ((indice != 0) && (indice <= agregado.elementos.length)) { //Si no es el primer elemento 
            
            indice--;
            objeto = agregado.elementos[indice];
        } else {
            throw new IndexOutOfBoundsException();
        }
        return objeto;
    }
    @Override
    public boolean hayMas() {
        boolean resultado = true;
        if (agregado.elementos.length == 0 || indice == agregado.elementos.length) {
            resultado = false;
        }
        return resultado;
    }

    @Override
        public boolean hayAnterior() {
        boolean resultado = true;
        if (indice == 0 ) { //Si es el primer elemento no tiene anterior
            resultado = false;
        }
        return resultado;
    }
    @Override
    public Object elementoActual() throws IndexOutOfBoundsException {
        Object objeto = null;
        if (indice < agregado.elementos.length) {
            objeto = agregado.elementos[indice];
        } else {
            throw new IndexOutOfBoundsException();
        }
        return objeto;
    }
}
