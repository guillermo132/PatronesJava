/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Fichero : Patron Proxy
 */
package AgenciaEmpleo;

import java.io.File;

/**
 * Fichero: Representa el fichero que se imprime con Proxy
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */

public class Fichero {

    /**
     * Identificador único del fichero.
     */
    private String id;
    /**
     * Nombre del fichero.
     */
    private String nombre;
    /**
     * Fecha de creación.
     */
    /**
     * Referencia al fichero físico.
     */
    private File fichero;
    /**
     * Tamaño del fichero.
     */
    private long tamaño;
    /**
     * Contador único para el identificador del fichero.
     */
    private static int contador = 0;

    /**
     * Constructor.
     * @param nombre Nombre del fichero.
     */
    public Fichero(String nombre) {
        this.id = Integer.toString(getContador());
        this.nombre = nombre;
        this.fichero = new File(nombre);
        this.tamaño = fichero.length();
    }

    /**
     * Obtiene el contador 
     * @return contador. 
     */
    private static int getContador() {
        return contador++;
    }

    /**
     * Devuelve el identificador único del fichero.
     * @return Identificador único del fichero.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Devuelve el nombre del fichero.
     * @return Nombre del fichero.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre del fichero.
     * @param nombre Nombre del fichero.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la referencia al fichero físico.
     * @return Referencia al fichero físico.
     */
    public File getFichero() {
        return this.fichero;
    }

    @Override
    public String toString() {
        return id + " " + nombre + " # " + tamaño;
    }
}
