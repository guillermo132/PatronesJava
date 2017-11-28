/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Agencia
 */
package AgenciaEmpleo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Agencia: Tiene todos los datos de los candidatos y oferta
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class Agencia implements Serializable {
    
//Declaración e inicialización de los atributos propios de la clase
    private ArrayList<Candidato> candidato = new ArrayList<>();
    private ArrayList<Oficina> oficina = new ArrayList<>();
    private ArrayList<Oferta> oferta = new ArrayList<>();
    //Declaramos los datos que el Empleado debe de introducir para poder iniciar el programa
    private static String usuario = "admin";
    private static String contraseña = "1234";

    /**
     * Constructor
     * @param 
     */
    public Agencia() {
    }

    /**
     * Método get
     * @return usuario
     */
    public static String getUsuario() {
        return usuario;
    }

    /**
     * Método set
     * @param usuario
     */
    public static void setUsuario(String usuario) {
        Agencia.usuario = usuario;
    }

    /**
     * Método get
     * @return contraseña
     */
    public static String getContraseña() {
        return contraseña;
    }

    /**
     * Método set
     * @param contraseña
     */
    public static void setContraseña(String contraseña) {
        Agencia.contraseña = contraseña;
    }

    /**
     * Método get 
     * @return candidato lista de Candidato
     */
    public ArrayList<Candidato> getCandidato() {
        return candidato;
    }

    /**
     * Método set 
     * @param candidato array de Candidato
     */
    public void setCandidato(ArrayList<Candidato> candidato) {
        this.candidato = candidato;
    }

    /**
     * Método get 
     * @return Oficina
     */
    public ArrayList<Oficina> getOficina() {
        return oficina;
    }

    /**
     * Método set 
     * @param oficina
     */
    public void setOficina(ArrayList<Oficina> oficina) {
        this.oficina = oficina;
    }

    /**
     * Método get
     * @return Oferta array de oferta
     */
    public ArrayList<Oferta> getOferta() {
        return oferta;
    }

    /**
     * Método set
     * @param oferta array de oferta
     */
    public void setOferta(ArrayList<Oferta> oferta) {
        this.oferta = oferta;
    }
}
