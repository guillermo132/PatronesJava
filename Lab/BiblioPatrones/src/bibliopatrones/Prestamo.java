/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliopatrones;

import java.io.Serializable;
import java.util.Calendar;


/**
 *
 * @author doverride
 */
public class Prestamo implements Serializable {
    private  String DNI;
    private String FechaFinPrestamo;

    public Prestamo(String DNI, String FechaFinPrestamo) {
        this.DNI = DNI;
        this.FechaFinPrestamo = FechaFinPrestamo;
    }

    public String getDNI() {
        return DNI;
    }

    public String getFechaFinPrestamo() {
        return FechaFinPrestamo;
    }    
}

