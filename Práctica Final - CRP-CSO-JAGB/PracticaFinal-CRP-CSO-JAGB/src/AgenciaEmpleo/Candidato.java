/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Candidato : Patron Prototype
 */
package AgenciaEmpleo;

import java.io.Serializable;
import java.util.List;
import javax.swing.ImageIcon;

/**
 * Implementa Copiable y Serializable
 * Candidato: Tiene todos los atributos y métodos get y set 
 * y el de copia para el patron prototype
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class Candidato implements Serializable,Copiable {
    
    //Creamos los atributos de la clase Candidato
    private String nombre;
    private String apellidos;
    private String NIF;
    private int tlf;
    private double SalMin;
    private double SalMax;
    private Direccion direccion;
    public List<String> cno;
    private String[] claves;
    private ImageIcon foto;
    private double grado;
    private String tipo;

    /**
     * Constructor
     * @param nombre nombre del candidatos
     * @param apellidos apellidos
     * @param NIF
     * @param tlf
     * @param SalMin salario mínimo para trabajar
     * @param SalMax salario máximo para trabajar
     * @param direccion
     * @param cno
     * @param clave
     * @param grado grado de minusvalia
     * @param tipo
     */
    public Candidato(String nombre, String apellidos, String NIF, int tlf, double SalMin, double SalMax, Direccion direccion, List<String> cno, String[] claves) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.tlf = tlf;
        this.SalMin = SalMin;
        this.SalMax = SalMax;
        this.direccion = direccion;
        this.cno = cno;
        this.claves = claves;
        this.tipo = "";
    }

    
    //Métodos get y set del ArrayList
    /**
     * devuelve la direccion
     *
     * @return direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * modifica la direccion
     *
     * @param direccion
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * devuelve Ocupacion
     *
     * @return
     */
    public List<String> getCno() {
        return cno;
    }

    /**
     * Modifica la ocupacion
     *
     * @param cno
     */
    public void setCno(List<String> cno) {
        this.cno = cno;
    }

    /**
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *
     * @return NIF
     */
    public String getNIF() {
        return NIF;
    }

    /**
     *
     * @param NIF
     */
    public void setNIF(String NIF) {
        this.NIF = NIF;
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

    /**
     * Devuelve el salario minimo
     *
     * @return SalMin
     */
    public double getSalMin() {
        return SalMin;
    }

    /**
     * modifica el salario
     *
     * @param SalMin
     */
    public void setSalMin(double SalMin) {
        this.SalMin = SalMin;
    }

    /**
     * devuelve el salario
     *
     * @return SalMax
     */
    public double getSalMax() {
        return SalMax;
    }

    /**
     * modifica el salario máximo
     *
     * @param SalMax
     */
    public void setSalMax(double SalMax) {
        this.SalMax = SalMax;
    }

    /**
     * devuelve el array de palabras claves
     *
     * @return claves
     */
    public String[] getClaves() {
        return claves;
    }

    /**
     * modifica el array de las palabras clave
     *
     * @param claves
     */
    public void setClaves(String[] claves) {
        this.claves = claves;
    }

    /**
     * devuelve la foto
     *
     * @return foto
     */
    public ImageIcon getFoto() {
        return foto;
    }

    /**
     * modifica la foto
     *
     * @param foto
     */
    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }

    
    /**
     * Con este método creamos nuevas ocupaciones
     *
     * @param cno
     * @return true si se ha añadido y false en caso contrario
     */
    public boolean altaCno(String cno) {
        if (!this.cno.contains(cno)) {//Si el array no contiene cno lo añade
            this.cno.add(cno);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeCno(String cno) {
        if (this.cno.contains(cno)) {//Si el array de cno, ya lo contiene lo elimina
            this.cno.remove(cno);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método toString
     * @param nombre
     * @param apellidos
     * @param NIF
     * @return
     */
    @Override
    public String toString() {
        return "Cliente:" + this.apellidos + this.nombre + " - NIF:" + this.NIF + " - Sueldo minimo:" + this.SalMin + " - Sueldo máximo:" + this.SalMax;
    }
    /**
     * Metodo copia de la clase copiable
     * Patron Prototype
     * @return nuevo candidato
     */
    @Override
    public Object copia() {
        return new Candidato(this.nombre, this.apellidos, this.NIF, this.tlf, this.SalMin, this.SalMax, this.direccion,this.cno,this.claves);
    }
    
    /**
     * Metodo para almacenar las claves del candidato
     * @return cadena
     */
    public String clavesArray(){
    String cadena = null;
        for (int i = 0; i < claves.length; i++) {
            cadena += claves[i] +",";
            
        }
        return cadena;
    }
}
