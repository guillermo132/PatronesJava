package FactoryMethod_Strategy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Adapter.AdaptadorPrestamo;
import static FactoryMethod_Strategy.Libro.DIASPRESTAMO;
import bibliopatrones.Prestamo;
import Observer.Socio;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

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
        return (prestamo != null); 
    }

    public void devolver(javax.swing.JDialog jDialog) {
       prestamo = null;
       JOptionPane.showMessageDialog(jDialog, "Publicacion "+Codigo+" devuelta correctamente");
       this.notificarSocios(jDialog);
    
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
    
    public void notificarSocios(javax.swing.JDialog jDialog){
        if (!this.observadores.isEmpty()){
            for (int i=0;i<this.observadores.size();i++ ){
                 JOptionPane.showMessageDialog(jDialog, "Aviso al socio "+observadores.get(i).getDNI()+" que la publicacion "+Codigo+" ha sido devuelta");
             }
        }
     }
    
    }
    

