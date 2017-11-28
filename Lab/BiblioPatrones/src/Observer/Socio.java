/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author doverride
 */
public class Socio implements Serializable {
    
    private String dni;
    private String contraseña;
    private String nombre;
    private String categoria;
    

    public Socio(String DNI, String Nombre, String Categoría,String contraseña) {
        this.dni = DNI;
        this.nombre = Nombre;
        this.categoria = Categoría;
        this.contraseña = contraseña;
    }

    public String getDNI() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoría() {
        return categoria;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    //PATRON OBSERVER
    
   public void notificar(){
   
   //AÑADIR LAS FUNCIONES DE NOTIFICACION.
   
   //ESCRIBIR EN UN FICHERO "Se comunica al socio con DNI: "+DNI+" que ha sido devuelta la publicación suscrita."
   JOptionPane.showMessageDialog(null, "Se comunica al socio con DNI: "+dni+" que ha sido devuelta la publicación suscrita.");
   }
    
    
}
