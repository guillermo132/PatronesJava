/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import Decorator_Iterator.ConjuntoSocios;
import Decorator_Iterator.LibreriaPublicaciones;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author doverride
 * 
 * 
 * MOTIVO DE USO DEL PATRON: en las que dicha clase controla el acceso a un recurso físico único (como puede ser el ratón o un archivo abierto en modo exclusivo) 
 */
public class Serializa {
    
    //Singleton
    private static Serializa INSTANCIA = null;
    
    //constructor privado para evitar que se instancie las veces que se quiera.
    private Serializa(){}
              
    public synchronized static void creaSerializa(){
      if (INSTANCIA==null){
          INSTANCIA = new Serializa();
      }
    }
    
    public static Serializa getInstancia(){
        if (INSTANCIA != null) {
            return INSTANCIA;
        }
        return null;   
      
    }
    
    public static void guardaDatos(ConjuntoSocios socios,LibreriaPublicaciones publicaciones) throws FileNotFoundException, IOException{
  
        if (!socios.isEmpty()){
                FileOutputStream oStream = new FileOutputStream("Socios.data");
                ObjectOutputStream osCan = new ObjectOutputStream(oStream);
                osCan.writeObject(socios);
                osCan.close();
                oStream.close();
       }else{ 
           System.out.println(" Error : No hay datos en socios");}
     
       if (!publicaciones.isEmpty()) {
                FileOutputStream ostreamOf = new FileOutputStream("Publicaciones.data");
                ObjectOutputStream oosOf = new ObjectOutputStream(ostreamOf);
                oosOf.writeObject(publicaciones);
                oosOf.close();
                ostreamOf.close();
        }else{
                System.out.println("Error: No hay datos... en ofertas");
            }
       
    }
    
/**
 * Lee cuando es llamada la función los datos guardados de los archivos.bin
 */
 public static ConjuntoSocios cargaSocios() {
    ConjuntoSocios socios = new ConjuntoSocios();
    FileInputStream istreamOf = null;
        try {
            
            istreamOf = new FileInputStream("Socios.data");
            ObjectInputStream oisOf = new ObjectInputStream(istreamOf);
            socios = (ConjuntoSocios) oisOf.readObject();   
            oisOf.close();
            istreamOf.close();
            return socios;
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Serializa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("CargoSocios, serializable");
        return socios;
 }    
        
public static LibreriaPublicaciones cargaPublicaciones() {
    LibreriaPublicaciones publicaciones = new LibreriaPublicaciones();
    FileInputStream istreamOf = null;
        try {
           
            istreamOf = new FileInputStream("Publicaciones.data");
            ObjectInputStream oisOf = new ObjectInputStream(istreamOf);
            publicaciones = (LibreriaPublicaciones) oisOf.readObject();
            istreamOf.close();
            return publicaciones;   
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Serializa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return publicaciones;
 } 
        
     
       
 }
    

