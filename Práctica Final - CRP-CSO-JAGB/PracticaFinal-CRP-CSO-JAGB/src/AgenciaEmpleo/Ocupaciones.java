/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Ocupaciones 
 */
package AgenciaEmpleo;

import java.io.Serializable;

/**
 * Ocupaciones: Nombre y codigo de la ocupacion de los candidatos y ofertas
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class Ocupaciones implements Serializable {

    private String codigo;
    private String nombre;

    /**
     * Constructor
     * @param codigo
     * @param nombre
     */
    public Ocupaciones(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;

    }
    /**
     * Método get.
     * @return codigo.
     */
    public String getCodigo() {
        return codigo;
    }
    /**
     * Método set.
     * @param codigo .
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    /**
     * Método get.
     * @return nombre.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método set.
     * @param nombre .
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ocupacion  cod :" + codigo + ", nombre :" + nombre;
    }
}