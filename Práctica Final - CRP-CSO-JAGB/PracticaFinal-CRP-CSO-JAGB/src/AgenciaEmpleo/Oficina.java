/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Oficina 
 */
package AgenciaEmpleo;

import java.io.Serializable;

/**
 * Oficina: Implementa Serializable
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class Oficina implements Serializable{
//Declaración de los atributos de la Empresa
    /*La empresa se caracteriza de una Oficina, y de un nombre
     * Luego declaramos los atributos de la Oficina
     */

    private String nomCompañia;//nombre de la empresa
    private String nomOficina;
    private int tlf;
    private Direccion direccion;//La oficina tiene una dirección luego realizamos una asociación de la clase Dirección

 /**
  * Constructor de la clase
  * @param nomCompañia
  * @param nomOficina
  * @param tlf
  * @param direccion 
  */
    public Oficina(String nomCompañia, String nomOficina, int tlf, Direccion direccion) {
        //Inicialización de los atributos
        this.nomCompañia = nomCompañia;
        this.nomOficina = nomOficina;
        this.tlf = tlf;
        this.direccion = direccion;

    }

/**
 * Constructor vacio
 */
    public Oficina() {
        
    }
//Métodos get y set
    /**
     * 
     * @return nomCompañia
     */
    public String getNomCompañia() {
        return nomCompañia;
    }
/**
 * 
 * @param nomCompañia 
 */
    public void setNomCompañia(String nomCompañia) {
        this.nomCompañia = nomCompañia;
    }
/**
 * 
 * @return nomOficina
 */
    public String getNomOficina() {
        return nomOficina;
    }
/**
 * 
 * @param nomOficina 
 */
    public void setNomOficina(String nomOficina) {
        this.nomOficina = nomOficina;
    }
/**
 * 
 * @return tlf
 */
    public int getTlf() {
        return tlf;
    }
/**
 * 
 * @param tlf 
 */
    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    //Métodos get y set del ArrayList
    
    /**
     * 
     * @return direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }
/**
 * 
 * @param direccion 
 */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Mostramos la información
     */
    public void  Imprime(){
    
        System.out.println("---------------------------Empresa---------------------------");
        System.out.println("Nombre Empresa: "+nomCompañia+"Nombre Oficina:"+nomOficina+"\nTlf: "+tlf+"Direccion:"+direccion.toString());
    }
}