/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Direccion : Patron Prototype
 */
package AgenciaEmpleo;

import java.io.Serializable;

/**
 * Implementa Copiable y Serializable
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class Direccion implements Serializable, Copiable {
    
    //Declaración de los atributos
    private String nombre;
    private int numero;
    private int piso;
    private String letra;
    private String localidad;
    private int codigoPostal;

    /**
     * Constructor vacio
     */
    public Direccion() {
    
    }
    /**
     * Constructor
     * @param nombre nombre de la calle
     * @param numero número del portal
     * @param piso número de piso 
     * @param letra letra del piso
     * @param localidad
     * @param codigoPostal 
     */
    public Direccion(String nombre, int numero, int piso, String letra, String localidad, int codigoPostal) {
        this.nombre = nombre;
        this.numero = numero;
        this.piso = piso;
        this.letra = letra;
        this.localidad = localidad;
        this.codigoPostal = codigoPostal;
    }
    
    /**
    * Método get
    * @return nombre
    */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método set
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método get
     * @return numero
     */
    public int getNumero() {
        return numero;
    }
    /**
     * Método set
     * @param numero 
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * Método get
     * @return piso
     */
    public int getPiso() {
        return piso;
    }
    /**
     * Método set
     * @param piso 
     */
    public void setPiso(int piso) {
        this.piso = piso;
    }
    /**
     * Método get
     * @return letra
     */
    public String getLetra() {
        return letra;
    }
    /**
     * Método set
     * @param letra 
     */
    public void setLetra(String letra) {
        this.letra = letra;
    }
    /**
     * Método get
     * @return localidad
     */
    public String getLocalidad() {
        return localidad;
    }
    /**
     * Método set
     * @param localidad 
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    /**
     * Método get
     * @return codigoPostal 
     */
    public int getCodigoPostal() {
        return codigoPostal;
    }
    /**
     * Método set
     * @param codigoPostal 
     */
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    /**
     * Método toString
     * @return 
     */
    @Override
    public String toString(){
        return"localidad: "+ localidad +"\n"+ nombre + ", NÂº " + numero + ", Piso " +piso +"Letra: " +letra + ",\nCP " + codigoPostal + '.';
    }

    @Override
    public Object copia() {
        return new Direccion(this.nombre,this.numero,this.piso,this.letra,this.localidad,this.codigoPostal); //To change body of generated methods, choose Tools | Templates.
    }

}
