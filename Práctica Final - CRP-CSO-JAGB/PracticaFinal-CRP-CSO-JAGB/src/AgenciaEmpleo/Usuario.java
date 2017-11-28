/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Usuario 
 */
package AgenciaEmpleo;

import java.io.Serializable;

/**
 * Usuario: Para iniciar en el sistema  
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class Usuario implements Serializable{
    
    String nombre;
    String password;

    /**
     * Constructor.
     * @param name .
     * @param password.
     */
    public Usuario(String name, String password){
    this.nombre = name;
    this.password = password;
    }
    /**
     * 
     * @return nombre.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @return password.
     */
    public String getPassword() {
        return password;
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
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
