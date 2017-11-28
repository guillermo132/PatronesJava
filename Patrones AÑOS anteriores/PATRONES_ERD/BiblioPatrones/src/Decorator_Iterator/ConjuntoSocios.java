/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator_Iterator;


import Observer.Socio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author doverride
 */
public class ConjuntoSocios implements Serializable{
     private HashMap<String,Socio> socios;
     private ArrayList<String> codigos;
     private int contador;

    public ConjuntoSocios() {
        socios = new HashMap<String,Socio>();
        codigos = new ArrayList<String>();
        contador = 0;
        socios.put("123", new Socio("123", "Admin", "Profesor", "1234"));
    }
    
    public void addSocio(Socio socio){
        if (!codigos.contains(socio.getDNI())){
            socios.put(socio.getDNI(), socio);
            codigos.add(socio.getDNI());
        }
        
    } 
    
    public void deleteSocio(Socio socio){
        socios.remove(socio);
    }

    public int  numeroSocios(){
        return socios.size();
    }
    public Socio nextSocio(){
        if (!socios.isEmpty()) {
        
            if (contador == socios.size()-1){
                contador =0;
            }else{
                contador ++;
            }
            return socios.get(contador);
            }
        return null;
    }
    
    public Socio primerSocio(){
        if (!socios.isEmpty()) {
            return socios.get(0);
            }
        return null;
    }
    
   public boolean estaSocio(String dni){
        if (socios.containsKey(dni)){
            return true;
        }else{
            return false;
        }
    }
    
    
    public boolean estaSocio(String dni, String pw){
        if (socios.containsKey(dni)&&(socios.get(dni).getContraseña().equals(pw))){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isEmpty(){
        return this.socios.isEmpty();
    }
    public HashMap<String,Socio> getSocios(){
    
        return socios;
    }
    
}
