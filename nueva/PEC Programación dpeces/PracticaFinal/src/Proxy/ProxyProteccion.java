package Proxy;

import Singleton.Serializa;
import javax.swing.JOptionPane;

public class ProxyProteccion {
        
    private String usuario;
    private String contraseña;
    private Serializa serializa;
    
    public ProxyProteccion(String usuario, String contraseña) {
        this.contraseña = contraseña;
        this.usuario = usuario;
    }
      
   /* public boolean permitirAcceso(){

        if (serializa.estaLogado(usuario,contraseña)){     
            return true;
        }
        else{
          JOptionPane.showMessageDialog(null, "Usuario o Password incorrectos", "Error de Login", JOptionPane.INFORMATION_MESSAGE); 
          return false;
        }   
    }   */
}
