/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demoAtriInt;

/**
 *
 * @author Salva
 */
public class Persona {

    private AtriInt id;
    private String nombre;

    public Persona(AtriInt id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AtriInt getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + '}';
    }
}
