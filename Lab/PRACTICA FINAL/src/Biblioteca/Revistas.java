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
public class Revistas extends Publicaciones {

    public Revistas(String Periodicidad, int Volumen, int Numeropublicacion, GregorianCalendar añodisponible, String Localizacion, String Codigo, String ISBN, String Titulo, String Autores, GregorianCalendar Fechapublicacion, String Fotografia, int Paginas, String Coleccion, String Materia, String Observaciones) {
        super(Codigo, ISBN, Titulo, Autores, Fechapublicacion, Fotografia, Paginas, Coleccion, Materia, Observaciones);
        this.Periodicidad = Periodicidad;
        this.Volumen = Volumen;
        this.Numeropublicacion = Numeropublicacion;
        this.añodisponible = añodisponible;
        this.Localizacion = Localizacion;
    }

   
    

    private String Periodicidad;

    public String getPeriodicidad() {
        return Periodicidad;
    }

    public void setPeriodicidad(String Periodicidad) {
        this.Periodicidad = Periodicidad;
    }
    private int Volumen;

    public int getVolumen() {
        return Volumen;
    }

    public void setVolumen(int Volumen) {
        this.Volumen = Volumen;
    }
    private int Numeropublicacion;

    public int getNumeropublicacion() {
        return Numeropublicacion;
    }

    public void setNumeropublicacion(int Numeropublicacion) {
        this.Numeropublicacion = Numeropublicacion;
    }
    private GregorianCalendar añodisponible;

    public GregorianCalendar getAñodisponible() {
        return añodisponible;
    }

    public void setAñodisponible(GregorianCalendar añodisponible) {
        this.añodisponible = añodisponible;
    }
    private String Localizacion;

    public String getLocalizacion() {
        return Localizacion;
    }

    public void setLocalizacion(String Localizacion) {
        this.Localizacion = Localizacion;
    }

    @Override
    public String toString() {
        return super.toString()+ "\r\nPeriodicidad=" + Periodicidad + "\r\n Volumen=" + Volumen + "\r\n Numeropublicacion=" + Numeropublicacion + "\r\n Localizacion=" + Localizacion ;
    }

    
}
