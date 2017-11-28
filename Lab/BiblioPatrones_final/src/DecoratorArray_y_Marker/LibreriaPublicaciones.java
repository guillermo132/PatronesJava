/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorArray_y_Marker;

import FactoryMethod_Strategy.Publicacion;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author doverride
 */
public class LibreriaPublicaciones implements Serializable{
    
    private ArrayList<Publicacion> publicaciones;
    private ArrayList<String> codigos;
    private int contador;

    public LibreriaPublicaciones() {
        publicaciones = new ArrayList<Publicacion>();
        codigos = new ArrayList<String>();
        contador = 0;
    }
    
    public void addPublicacion(Publicacion publicacion){
            this.publicaciones.add(publicacion);     
    }
    
    public void deletePublicacion(Publicacion publicacion){
        publicaciones.remove(publicacion);
    }

    public int  numeroPublicaciones(){
        return publicaciones.size();
    }
    public Publicacion nextPubli(){
        if (!publicaciones.isEmpty()) {
        
            if (contador == publicaciones.size()-1){
                contador =0;
            }else{
                contador ++;
            }
            return publicaciones.get(contador);
            }
        return null;
    }
    
    public Publicacion primeraPubli(){
        if (!publicaciones.isEmpty()) {
            return publicaciones.get(0);
            }
        return null;
    }
    
    public boolean isEmpty(){
        
        return publicaciones.isEmpty();
    }
    public ArrayList<Publicacion> getPublicacion(){
        return publicaciones;
    }
    
    public Publicacion publicacionActual(){
    
        return this.publicaciones.get(contador);
    }
    
    
    public ArrayList<String> getReservasde(String dni){
        ArrayList<String> reservas = new ArrayList<String>();
        for (int i = 0;i<this.publicaciones.size(); i++) {    
            if( publicaciones.get(i).getPrestamo().getDNI().equals(dni) ){
                reservas.add(publicaciones.get(i).getTitulo()+publicaciones.get(i).getPrestamo().getFechaFinPrestamo());
            }
        }
        
     return reservas; 
    }
    public boolean estaPublicacion(String codigo){
        if (!codigos.contains(codigo)) {
               this.codigos.add(codigo);
               return false;
        }else{
            return true;
        }
    
    }
    
}
