/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author doverride
 */
public class FacadeImpresoraBasica {
    
    
    private ImpresoraGlobal impresora;

    public FacadeImpresoraBasica(String Texto, int copias) {
        
        impresora = new ImpresoraGlobal(copias,"PDF", Texto, false);
        
    }
    
    public void imprimir(){
        
        impresora.imprimir();
    }
    
    
}
