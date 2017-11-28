/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import Decorator_Iterator.ConjuntoSocios;
import Observer.Socio;
import bibliopatrones.Gestion;
import javax.swing.JOptionPane;

/**
 *
 * @author doverride
 */
public class ProxyProteccion {
    
    private ConjuntoSocios socios;
    private String dni;
    private String contraseña;
    
    
    public ProxyProteccion(String dni, String pwd) {
        this.contraseña = pwd;
        this.socios = new ConjuntoSocios();
        this.dni = dni;
    }
    
    
    public boolean permitirAcceso(javax.swing.JFrame jFrame){
        //Si esta dentro de la base de datos. ABRE la VENTA GESTION.
        
        if (socios.estaSocio(dni, contraseña)){     
            return true;
        }
        else{
            JOptionPane.showMessageDialog(jFrame, "EL USUARIO O LA CONTRASEÑA SON ERRONEOS");
            return false;
        }
      
    }
    
    
}
