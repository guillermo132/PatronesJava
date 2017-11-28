/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

/**
 *
 * @author doverride
 */
public class EstadoLibre extends Estado{

    public EstadoLibre(GestionPrestamo delegado) {
        super(delegado);
    }

    @Override
    public void accion() {
        super.delegado.Devolverprestamo(codigo, tipo);
            
        
        //AGREGAR  devolverPrestamo;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
