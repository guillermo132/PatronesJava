/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author joserra
 */
public class Usuario extends Observable implements Serializable{
    //Atributos
    private String nombre;
    private String apellidos;
    private String NIF;
    private String tipoUsuario;
    private String nombreUsuario;
    private String clave;
    private boolean profesor = false;
    private boolean invitado = false;
    private ArrayList<Tfg> listaTfg = new ArrayList<Tfg>();
    private boolean asignado = false;
    private Usuario profesorFavorito;
    private double notaMedia;
    //Constructor
    public Usuario(String nombre, String apellidos, String NIF, String nombreUsuario, String clave, boolean profesor){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.NIF=NIF;
        this.nombreUsuario=nombreUsuario;
        this.clave=clave;
        this.profesor = profesor;
    }
    public Usuario(String nombre, String apellidos, String NIF, String nombreUsuario, String clave,double notaMedia ,boolean profesor){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.NIF=NIF;
        this.nombreUsuario=nombreUsuario;
        this.clave=clave;
        this.profesor = profesor;
        this.notaMedia = notaMedia;
    }
    
    public Usuario(String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
        this.invitado = true;
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
    public void setProfesor(boolean profesor){
        this.profesor = profesor;
    }
    public boolean getProfesor(){
        return this.profesor;
    }
    
    public boolean setTfg(Tfg tfg){
        if(this.listaTfg.size() == 5 || !this.profesor){
            return false;
        }else{
            this.listaTfg.add(tfg);
            setChanged();
            notifyObservers();
            return true;
        }
    }
    
    public ArrayList<Tfg> getTfg(){
        return this.listaTfg;
    }
    public boolean getInvitado(){
        return this.invitado;
    }
    
    
    public void setAsignado(boolean asignado){
        this.asignado = asignado;
    }
    
    public boolean getAsignado(){
        return asignado;
    }
    public void setProfesorFavorito(Usuario user){
        if(!this.profesor){
            this.profesorFavorito = user;
        }
    }
    public Usuario getProfesorFavorito(){
        return this.profesorFavorito;
    }
    
    public void setNotaMedia(float notaMedia){
        this.notaMedia = notaMedia;
    }
    public double getNotaMedia(){
        return this.notaMedia;
    }
    
    
}
