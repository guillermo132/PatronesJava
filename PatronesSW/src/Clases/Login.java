/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.Usuario;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author joserra
 */
public class Login implements Serializable{
    
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    
    private static Login instancia;
    
    
    private Login() throws FileNotFoundException,  ClassNotFoundException,   IOException {
        File fichero = new File("usuarios.txt");
        
        if(fichero.exists()){
        try{
            
        FileInputStream archiv= new FileInputStream("usuarios.txt");
        ObjectInputStream lector = new ObjectInputStream(archiv);
        usuarios = (ArrayList) lector.readObject();
      
        }catch(EOFException e){
            
            }
        } else {
        //Creamos el fichero
        fichero.createNewFile();
        }
    }
    
    public static Login getInstancia() throws FileNotFoundException, IOException, ClassNotFoundException {
        if (instancia == null) {// Si la instancia es null, se crea.
            instancia = new Login();
        }
        return instancia;
    }
    
    public boolean estaLogado(String userId,String password) {
        int i;
        boolean coincidencia= false;
       
        for( i = 0; i<usuarios.size();i++){
            
            if( usuarios.get(i).getNombre().equals(userId) && usuarios.get(i).getClave().equals(password)){
            coincidencia=true;
            }
         
        }
        return coincidencia;
    }
}
