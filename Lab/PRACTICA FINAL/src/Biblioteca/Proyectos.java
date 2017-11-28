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
public class Proyectos extends ProyectosTesis {

    public Proyectos(String Titulacion, String Tribunal, String Entidad, String Departamento, double Calificacion, GregorianCalendar FechaLectura, String Codigo, String ISBN, String Titulo, String Autores, GregorianCalendar Fechapublicacion, String Fotografia, int Paginas, String Coleccion, String Materia, String Observaciones) {
        super(Tribunal, Entidad, Departamento, Calificacion, FechaLectura, Codigo, ISBN, Titulo, Autores, Fechapublicacion, Fotografia, Paginas, Coleccion, Materia, Observaciones);
        this.Titulacion = Titulacion;
    }

    private String Titulacion;

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    @Override
    public String toString() {
        return super.toString()+"\r\n Titulacion=" + Titulacion + "\r\n";
    }

    
}
