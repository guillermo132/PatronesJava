/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod_Strategy;

import bibliopatrones.Prestamo;
import Observer.Socio;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author Estefania
 */
public class Libro extends Publicacion {

    static final int DIASPRESTAMO = 15;
    private String Editorial;
    private String Contenido;
    private String Edicion;

    public Libro(String Editorial, String Contenido, String Edicion, String Codigo, String ISBN, String Titulo, String Autores) {
        super(Codigo, ISBN, Titulo, Autores);
        this.Editorial = Editorial;
        this.Contenido = Contenido;
        this.Edicion = Edicion;
        super.tipo = "Libro";
    }
   


    @Override
    public void muestraVentana() {
        
        //CREAR VENTANA MODAL para los datos de Libro
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
        super.prestamo = new Prestamo(dnisocio,fecha) ;
        
    }

    
    @Override
    public String getParam1() {
        return Editorial;

    }

    @Override
    public String getParam2() {
        return Contenido;
       
    }

    @Override
    public String getParam3() {
        return Edicion;
      
    }
      
    
    
}
