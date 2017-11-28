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
public class Libros extends Publicaciones {

    private String Editorial;

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }
    private String Localidad;

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }
    private String Contenido;

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }
    private int Edicion;

    public int getEdicion() {
        return Edicion;
    }

    public void setEdicion(int Edicion) {
        this.Edicion = Edicion;
    }
    private String Localizacion;

    public String getLocalizacion() {
        return Localizacion;
    }

    public void setLocalizacion(String Localizacion) {
        this.Localizacion = Localizacion;
    }

    public Libros(String Editorial, String Localidad, String Contenido, int Edicion, String Localizacion, String Codigo, String ISBN, String Titulo, String Autores, GregorianCalendar Fechapublicacion, String Fotografia, int Paginas, String Coleccion, String Materia, String Observaciones) {
        super(Codigo, ISBN, Titulo, Autores, Fechapublicacion, Fotografia, Paginas, Coleccion, Materia, Observaciones);
        this.Editorial = Editorial;
        this.Localidad = Localidad;
        this.Contenido = Contenido;
        this.Edicion = Edicion;
        this.Localizacion = Localizacion;
    }

    @Override
    public String toString() {
        return super.toString()+"\r\nEditorial=" + Editorial + "\r\n Localidad=" + Localidad + "\r\n Contenido=" + Contenido + "\r\n Edicion=" + Edicion + "\r\n Localizacion=" + Localizacion ;
    }

    
}
