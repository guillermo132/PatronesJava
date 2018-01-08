/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronessw;

import java.io.Serializable;

/**
 *
 * @author joserra
 */
public class Usuario implements Serializable{
    //Atributos
    String nombre;
    String apellidos;
    String NIF;
    String tipoUsuario;
    String nombreUsuario;
    String clave;
    
    //Constructor
    public Usuario(String nombre, String apellidos, String NIF, String nombreUsuario, String clave){
        
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.NIF=NIF;
        this.nombreUsuario=nombreUsuario;
        this.clave=clave;
    
    }
    
    //Métodos Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos=apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF=NIF;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario=nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave=clave;
    }
}
