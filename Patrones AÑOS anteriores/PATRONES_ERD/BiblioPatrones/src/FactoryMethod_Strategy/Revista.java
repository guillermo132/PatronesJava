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


/**
 *
 * @author Estefania
 */
public class Revista extends Publicacion {
    final int DIASPRESTAMO = 7;
    private String Periodicidad;
    private String Volumen;
    private String Numeropublicacion;

    public Revista(String Periodicidad, String Volumen, String Numeropublicacion, String Codigo, String ISBN, String Titulo, String Autores) {
        super(Codigo, ISBN, Titulo, Autores);
        this.Periodicidad = Periodicidad;
        this.Volumen = Volumen;
        this.Numeropublicacion = Numeropublicacion;
        this.tipo = "Revista";
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
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sdf.format(cal.getTime());
       //creo un nuevo prestamo y lo añado al libro.
        super.prestamo = new Prestamo(dnisocio,fecha); 
        Ticket t = new Ticket(fecha, dnisocio, super.Codigo);
        InterfacePrestamo intP = new AdaptadorPrestamo(t);
        intP.crearTicket();
    }


    @Override
    public String getParam1() {
        return Periodicidad;
    }

    @Override
    public String getParam2() {
        return Volumen;
    }

    @Override
    public String getParam3() {
        return Periodicidad;
    }

    
}
