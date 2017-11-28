/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.util.GregorianCalendar;

/**
 *
 * @author Estefania
 */
public class Prestamo {
    
    private Estado miEstado;

    public Prestamo(String CodigoUsuario, String CodigoPublicacion, GregorianCalendar FechaPrestamo) {
        this.CodigoUsuario = CodigoUsuario;
        this.CodigoPublicacion = CodigoPublicacion;
        this.FechaPrestamo = FechaPrestamo;
        
    }

    private String CodigoUsuario;

    public String getCodigoUsuario() {
        return CodigoUsuario;
    }

    public void setCodigoUsuario(String CodigoUsuario) {
        this.CodigoUsuario = CodigoUsuario;
    }
    private String CodigoPublicacion;

    public String getCodigoPublicacion() {
        return CodigoPublicacion;
    }

    public void setCodigoPublicacion(String CodigoPublicacion) {
        this.CodigoPublicacion = CodigoPublicacion;
    }
    private GregorianCalendar FechaPrestamo;

    public GregorianCalendar getFechaPrestamo() {
        return FechaPrestamo;
    }

    public void setFechaPrestamo(GregorianCalendar FechaPrestamo) {
        this.FechaPrestamo = FechaPrestamo;
    }

    
}
