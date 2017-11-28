/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Login : Patron Singleton
 */
package AgenciaEmpleo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 * Login: Clase para manejar el login/logout de los usuarios. Implementa el patrón Singleton. 
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class Login {

    /**
     * Lista de usuarios logados.
     */
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    /**
     * Instancia de la clase.
     */
    private static Login instancia;

    /**
     * Constructor
     * @param 
     * @throws  FileNotFoundException
     * @throws  ClassNotFoundException
     * @throws  IOException
     */
    private Login() throws FileNotFoundException,  ClassNotFoundException,   IOException {
        File fichero = new File("usuarios.dat");
        
        if(fichero.exists()){
        try{
            
        FileInputStream archiv= new FileInputStream("usuarios.dat");
        ObjectInputStream lector = new ObjectInputStream(archiv);
        usuarios = (ArrayList) lector.readObject();
      
        }catch(EOFException e){
            
            }
        } else {
        //Creamos el fichero
        fichero.createNewFile();
        }
    }
     

    /**
     * Devuelve la instancia de la clase.
     * @return Instancia de la clase.
     * @throws  FileNotFoundException
     * @throws  ClassNotFoundException
     * @throws  IOException
     */
    public static Login getInstancia() throws FileNotFoundException, IOException, ClassNotFoundException {
        if (instancia == null) {// Si la instancia es null, se crea.
            instancia = new Login();
        }
        return instancia;
    }

    /**
     * Comprueba si el usuario está logado.
     * @param userId Identificador del usuario.
     * @param password
     * @return coincidencia true si el usuario está logado, false en caso contrario.
     */
    public boolean estaLogado(String userId,String password) {
        int i;
        boolean coincidencia= false;
       
        for( i = 0; i<usuarios.size();i++){
            
            if( usuarios.get(i).getNombre().equals(userId) && usuarios.get(i).getPassword().equals(password)){
            coincidencia=true;
            }
         
        }
        return coincidencia;
    }
    
    
    
    /**
     * Añade al usuario pasado como argumento a la lista de usuarios logados en caso de que no esté logado.
     * @param userId Identificador del usuario.
     * @param password
     */    
    public void addLogin(String userId, String password){
        FactoriaUsuarios factoria = new FactoriaUsuarios();
        if (!estaLogado(userId,password)){
            usuarios.add(factoria.getUsuario(userId, password));
        }
    }

    /**
     * Guarda el login
     * @throws  FileNotFoundException
     * @throws  IOException
     */
    public void guardarLogin() throws FileNotFoundException, IOException{
    
                FileOutputStream archivcan = new FileOutputStream("usuarios.dat");
                ObjectOutputStream obcan = new ObjectOutputStream(archivcan);
                obcan.writeObject(usuarios); // guardamos en un .dat el arraylist de candidatos
                archivcan.close();
    
    }

    /**
     * Elimina al usuario pasado como argumento de la lista de usuarios logados en caso de que esté logado.
     * @param userId Identificador del usuario.
     * @param password
     */
    public void borrarLogin(String userId,String password) {
        if (estaLogado(userId,password)){
            usuarios.remove(new Usuario(userId,password));
        }        
    }
} 
