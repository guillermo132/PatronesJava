package FactoryMethod_Strategy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bibliopatrones.Prestamo;
import Observer.Socio;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author doverride
 */
public abstract class Publicacion  implements Serializable{
    protected String tipo;
    protected Prestamo prestamo; // cuando new prestam siempre codigo + prestamo.
    protected String Codigo;
    protected String ISBN;
    protected String Titulo;
    protected String Autores;
    
    //Patron Observer
    protected ArrayList<Socio> observadores;
    //Fpatron

    public Publicacion(String Codigo, String ISBN, String Titulo, String Autores) {
        
        this.observadores = new ArrayList<Socio>();
        this.prestamo = null;
        this.Codigo = Codigo;
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autores = Autores;
      
    }

    //Crea una ventana modal, con los datos del préstamo.
    public abstract void muestraVentana();
    
    //Patrón Strategy 
    public abstract void prestar(String dnisocio);// revistas max 7días , libros 15, proyectos&Tesis 30
  
    public abstract String getParam1();
    
    public abstract String getParam2();
    
    public abstract String getParam3();
   
    
    
    public boolean estaPrestada() {
        System.out.println(prestamo != null);
        return (prestamo != null); 
    }

    public void devolver() {
       prestamo = null;
       this.notificarSocios();
    }

    public Prestamo getPrestamo() {
        return this.prestamo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutores() {
        return Autores;
    }

    public String getTipo() {
        return tipo;
    }
  
    //FUNCIONES DEL PATRÓN OBSERVER.
    
    public void adscribirNotifSocio(Socio socio){
        this.observadores.add(socio);
    }
    public void quitarNotifSocio(Socio socio){
        this.observadores.remove(socio);
    }
    
    public void notificarSocios(){
        for(int i=0; i<observadores.size();i++){
            observadores.get(i).notificar();
        }
    
    }
    
}
