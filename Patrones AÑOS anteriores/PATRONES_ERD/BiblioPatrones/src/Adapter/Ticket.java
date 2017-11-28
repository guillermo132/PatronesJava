/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Fani
 */
public class Ticket {
    
    
    private final String fechaFin;
    private String CIFCliente, c;
    


    public Ticket(String fecha, String CIFCliente, String codigo) {
        this.CIFCliente = CIFCliente;
        this.fechaFin = fecha;
        this.c = codigo;
    }

    public String getFechaFin(){
        return fechaFin; 
    }

    public String getCIFCliente() {
        return CIFCliente;
    }

    public String getCodigoPublicacion() {
        return c;
    }
   
}
