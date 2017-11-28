package Singleton;

import AbstractFactory.ControlUsuarios;
import Clases.Candidato;
import Clases.Oferta;
import Clases.Oficina;
import AgenciaEmpleo.Usuario;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serializa {
    
    //Singleton
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private static Serializa instancia;
    
    //constructor privado para evitar que se instancie las veces que se quiera.
    private Serializa()throws FileNotFoundException,  ClassNotFoundException,   IOException{
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
              
    
    public static Serializa getInstancia()throws FileNotFoundException, IOException, ClassNotFoundException{
          if (instancia == null) {// Si la instancia es null, se crea.
            instancia = new Serializa();
        }
        return instancia;
    }
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
       public void addLogin(String userId, String password){
        ControlUsuarios factoria = new ControlUsuarios();
        if (!estaLogado(userId,password)){
            usuarios.add(factoria.getUsuario(userId, password));
        }
    }
          public void guardarLogin() throws FileNotFoundException, IOException{
    
                FileOutputStream archivcan = new FileOutputStream("usuarios.dat");
                ObjectOutputStream obcan = new ObjectOutputStream(archivcan);
                obcan.writeObject(usuarios); // guardamos en un .dat el arraylist de candidatos
                archivcan.close();
    
    }

     //Serialización
    /**
     Obtine los datos de los candidatos
     */
    public static void getDatosCandidatos(){
        try {
         //Lectura de los objetos
            FileInputStream fisPer = new FileInputStream("candidatos.dat");
            ObjectInputStream oisPer = new ObjectInputStream(fisPer);

            try {
                while (true) {
                    Candidato can = (Candidato) oisPer.readObject();
                    AgenciaEmpleo.UtilAgencia.candidatos.add(can);
                }
            } catch (EOFException e) {
                System.out.println("Lectura de los objetos de tipo Candidato finalizada");
            }
            fisPer.close();

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }       
    }  
    /**
     Guarda los datos de los candidatos
     */
    public static void guardarDatosCandidatos(){
    try {
            /****** Serialización de los objetos *******/
            FileOutputStream fosPer = new FileOutputStream("candidatos.dat");
            ObjectOutputStream oosPer = new ObjectOutputStream(fosPer);
            
            for (int i = 0; i <  AgenciaEmpleo.UtilAgencia.candidatos.size(); i++) {
                oosPer.writeObject( AgenciaEmpleo.UtilAgencia.candidatos.get(i));
            }
            fosPer.close();
            System.out.println("Escritura de los objetos de tipo Candidato finalizada");
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    /**
     Obtiene los datos de las oficinas
     */
    public static void getDatosOficinas(){
        try {
         //Lectura de los objetos
            FileInputStream fisPer = new FileInputStream("oficinas.dat");
            ObjectInputStream oisPer = new ObjectInputStream(fisPer);

            try {
                while (true) {
                    Oficina of = (Oficina) oisPer.readObject();
                     AgenciaEmpleo.UtilAgencia.oficinas.add(of);
                }
            } catch (EOFException e) {
                System.out.println("Lectura de los objetos de tipo Oficina finalizada");
            }
            fisPer.close();

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    /**
     Guarda los datos de las oficinas
     */
    public static void guardarDatosOficinas(){
    try {
            /****** Serialización de los objetos *******/
            FileOutputStream fosPer = new FileOutputStream("oficinas.dat");
            ObjectOutputStream oosPer = new ObjectOutputStream(fosPer);
            
            for (int i = 0; i <  AgenciaEmpleo.UtilAgencia.oficinas.size(); i++) {
                oosPer.writeObject( AgenciaEmpleo.UtilAgencia.oficinas.get(i));
            }
            fosPer.close();
            System.out.println("Escritura de los objetos de tipo Oficina finalizada");
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
    /**
     Obtiene los datos de las ofertas
     */
    public static void getDatosOfertas(){
        try {
         //Lectura de los objetos
            FileInputStream fisPer = new FileInputStream("ofertas.dat");
            ObjectInputStream oisPer = new ObjectInputStream(fisPer);

            try {
                while (true) {
                    Oferta ofe = (Oferta) oisPer.readObject();
                     AgenciaEmpleo.UtilAgencia.ofertas.add(ofe);
                }
            } catch (EOFException e) {
                System.out.println("Lectura de los objetos de tipo Oferta finalizada");
            }
            fisPer.close();

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    /**
     Guarda los datos de las ofertas
     */
    public static void guardarDatosOfertas(){
    try {
            /****** Serialización de los objetos *******/
            FileOutputStream fosPer = new FileOutputStream("ofertas.dat");
            ObjectOutputStream oosPer = new ObjectOutputStream(fosPer);
            
            for (int i = 0; i <  AgenciaEmpleo.UtilAgencia.ofertas.size(); i++) {
                oosPer.writeObject( AgenciaEmpleo.UtilAgencia.ofertas.get(i));
            }
            fosPer.close();
            System.out.println("Escritura de los objetos de tipo Ofertas finalizada");
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}