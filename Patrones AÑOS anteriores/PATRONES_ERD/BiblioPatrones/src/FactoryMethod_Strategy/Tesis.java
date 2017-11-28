/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod_Strategy;

import Adapter.AdaptadorPrestamo;
import Adapter.InterfacePrestamo;
import Adapter.Ticket;
import bibliopatrones.Prestamo;
import Observer.Socio;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Estefania
 */
public class Tesis extends Publicacion {
    final int DIASPRESTAMO = 30;
    private String Tribunal;
    private String Departamento;
    private String Calificacion;

    public Tesis(String Tribunal, String Departamento, String calificacion, String Codigo, String ISBN, String Titulo, String Autores) {
        super(Codigo, ISBN, Titulo, Autores);
        this.Tribunal = Tribunal;
        this.Departamento = Departamento;
        this.Calificacion = calificacion;
        this.tipo = "Tesis";
    }

    @Override
    public void muestraVentana() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void prestar(String dnisocio) {
         //Creo la fecha de devolucion del prestamos
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, DIASPRESTAMO);
       //creo un nuevo prestamo y lo añado al libro.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sdf.format(cal.getTime());
        super.prestamo = new Prestamo(dnisocio,fecha) ;
        Ticket t = new Ticket(fecha, dnisocio, super.Codigo);
        InterfacePrestamo intP = new AdaptadorPrestamo(t);
        intP.crearTicket();
    }

    public String getTribunal() {
        return Tribunal;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public String getCalificacion() {
        return Calificacion;
    }

    @Override
    public String getParam1() {
        return Tribunal;
    }

    @Override
    public String getParam2() {
        return Departamento;
    }

    @Override
    public String getParam3() {
        return Calificacion;
    }


  
    
}