/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author PeCeS
 */
public class Oficina implements Serializable{
    
    
    private String nombre;
    private String telefono;
    private Direccion direccion;
 
    
    //Constructor de Oficina
    /**
     *
     * @param nombre
     * @param telefono
     * @param direccion
     */
    public Oficina(String nombre, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
        
        

    /**
     * Get the value of direccion
     *
     * @return the value of direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Set the value of direccion
     *
     * @param direccion new value of direccion
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }


    /**
     * Get the value of telefono
     *
     * @return the value of telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Set the value of telefono
     *
     * @param telefono new value of telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
