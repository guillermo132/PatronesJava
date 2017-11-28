/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import DecoratorArray_y_Marker.ConjuntoSocios;
import Observer.Socio;
import bibliopatrones.Gestion;
import bibliopatrones.Login;
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
        this.socios = new ConjuntoSocios();
        this.contraseña = pwd;
        this.dni = dni;
    }
    
    
    public boolean permitirAcceso(){
        //Si esta dentro de la base de datos. ABRE la VENTA GESTION.
        
        if (socios.estaSocio(dni, contraseña)){     
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "EL USUARIO O LA CONTRASEÑA SON ERRONEOS");
            JOptionPane.showMessageDialog(new Login(), this);
            return false;
        }
        /*  
        */
        
        //Si no está dentro de la base de datos.
        /*
        
        */
        
    }
    
    
}
