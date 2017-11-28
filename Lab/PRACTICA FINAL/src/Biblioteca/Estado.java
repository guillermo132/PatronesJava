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
public abstract class Estado {
    public GestionPrestamo delegado;

    public Estado(GestionPrestamo delegado) {
        this.delegado = delegado;
    }
    
    public abstract void accion(Prestamo p);
    
    
}
