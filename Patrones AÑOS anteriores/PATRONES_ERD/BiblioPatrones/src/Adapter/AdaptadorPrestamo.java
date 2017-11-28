/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fani
 */
public class AdaptadorPrestamo implements InterfacePrestamo{
    private Ticket t;

    public AdaptadorPrestamo(Ticket ticket) {
        this.t = ticket;
    }

    public String getCIF() {
        return this.t.getCIFCliente();
    }
     
    public String getFechaFin() {
        return this.t.getFechaFin();
    }
    
    public String getCodigoPubli() {
        return this.t.getCodigoPublicacion();
    }
    
     
    public void crearTicket(){
        
        BufferedWriter bw = null;
        try {
            GregorianCalendar g = new GregorianCalendar(Locale.ROOT);
            int dia = g.get(Calendar.DAY_OF_MONTH);
            int mes = g.get(Calendar.MONTH);
            mes++;
            int año = g.get(Calendar.YEAR);
            int hora = g.get(Calendar.HOUR);
            int min = g.get(Calendar.MINUTE);
            int sec = g.get(Calendar.SECOND);
            String nombre = "Tickets/"+ this.getCIF()+".txt";
            bw = new BufferedWriter(new FileWriter(nombre));
            bw.write("\r\n");
            bw.write("CODIGO PUBLICACION: ");
            bw.write(""+ this.getCodigoPubli());
            bw.write("\r\n");
            bw.write("CODIGO SOCIO: ");
            bw.write(this.getCIF());
            bw.write("\r\n");
            bw.write("FECHA INICIO: ");
            bw.write(""+dia);
            bw.write("/");
            bw.write(""+mes);
            bw.write("/");
            bw.write(""+año);
            bw.write(" HORA: ");
            bw.write(""+hora);
            bw.write(":");
            bw.write(""+min);
            bw.write(":");
            bw.write(""+sec);
            bw.write("\r\n");
            bw.write("FECHA DEVOLUCION: ");
            bw.write(""+ getFechaFin());
            bw.write("\r\n");
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(AdaptadorPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(AdaptadorPrestamo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
    
}
