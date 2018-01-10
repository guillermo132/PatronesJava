/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import Clases.Tfg;
import Clases.Usuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author joserra
 */
public class Serializa {
    ArrayList<Tfg> tfgs = new ArrayList<>();
    HashMap<String, Usuario> tablaUsuarios = new HashMap<>();
    private static Serializa instancia;
    
    
    private Serializa()throws FileNotFoundException,  ClassNotFoundException,   IOException{
        File fichero = new File("usuarios.txt"); 
        if(!fichero.exists()){
            //Creamos el fichero
            fichero.createNewFile();
        }
        File ficherotfg = new File("tfgs.txt"); 
        if(!ficherotfg.exists()){
            //Creamos el fichero
            fichero.createNewFile();
        }
    }
    
    public static Serializa getInstancia()throws FileNotFoundException, IOException, ClassNotFoundException{
          if (instancia == null) {// Si la instancia es null, se crea.
            instancia = new Serializa();
        }
        return instancia;
    }
    
    
    //Metodo para cargar los clientes del .dat
    public HashMap<String, Usuario> CargarClientes(){
        try{
            FileInputStream fis = new FileInputStream("usuarios.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            tablaUsuarios=(HashMap)ois.readObject();
            fis.close();

        }catch(Exception e){
           System.err.println("No hay archivo que almacene los clientes."); 
           tablaUsuarios=new HashMap<>();
        }
        return tablaUsuarios;
        
    }
    
    public void GuardarCliente(String correo, Usuario u){
        try{
            tablaUsuarios.put(correo, u);
            FileOutputStream fos=new FileOutputStream("usuarios.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            /*for (HashMap.Entry<String, Usuario> entry : tablaUsuarios.entrySet()) {
                System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue().getNIF());
            }*/
            oos.writeObject(tablaUsuarios);
            fos.close();
        }catch(Exception e){
           System.err.println("No se ha podido guardar el cliente."); 
           tablaUsuarios=new HashMap<>();
        }
    }
    
    public ArrayList<Tfg> CargarTfg(){
        try{
            FileInputStream fis = new FileInputStream("tfgs.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            tfgs=(ArrayList)ois.readObject();
            fis.close();   
        }catch(Exception e){
           System.err.println("No hay archivo que almacene los tfg."); 
           tfgs=new ArrayList<>();
        }
        return tfgs;
        
    }
    
    public void GuardarTfg(Tfg tfg){
        try{
            tfgs.add(tfg);
            FileOutputStream fos=new FileOutputStream("tfgs.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(tfgs);
            fos.close();
        }catch(Exception e){
           System.err.println("No se ha podido guardar el cliente."); 
           tfgs=new ArrayList<>();
        }
    }
}
