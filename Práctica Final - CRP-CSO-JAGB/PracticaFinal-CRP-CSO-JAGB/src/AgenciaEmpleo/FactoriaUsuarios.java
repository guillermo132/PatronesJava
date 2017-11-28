/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase FactoriaUsuarios : Patron Factory Method
 */
package AgenciaEmpleo;

/**
 *
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class FactoriaUsuarios {
    
    
    /**
     * Crea un objeto de tipo Usuario.
     * @param name nombre del usuario
     * @param password contraseña del usuario
     * @return Objeto de tipo Usuario.
     */ 
    public Usuario getUsuario(String name, String password) {
        return new Usuario(name,password);
    }
}
