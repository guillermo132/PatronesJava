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
public class ProyectosTesis extends Publicaciones {

    public ProyectosTesis(String Tribunal, String Entidad, String Departamento, double Calificacion, GregorianCalendar FechaLectura, String Codigo, String ISBN, String Titulo, String Autores, GregorianCalendar Fechapublicacion, String Fotografia, int Paginas, String Coleccion, String Materia, String Observaciones) {
        super(Codigo, ISBN, Titulo, Autores, Fechapublicacion, Fotografia, Paginas, Coleccion, Materia, Observaciones);
        this.Tribunal = Tribunal;
        this.Entidad = Entidad;
        this.Departamento = Departamento;
        this.Calificacion = Calificacion;
        this.FechaLectura = FechaLectura;
    }

 

    private String Tribunal;

    public String getTribunal() {
        return Tribunal;
    }

    public void setTribunal(String Tribunal) {
        this.Tribunal = Tribunal;
    }
    private String Entidad;

    public String getEntidad() {
        return Entidad;
    }

    public void setEntidad(String Entidad) {
        this.Entidad = Entidad;
    }
    private String Departamento;

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }
    private double Calificacion;

    public double getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(double Calificacion) {
        this.Calificacion = Calificacion;
    }

    private GregorianCalendar FechaLectura;

    public GregorianCalendar getFechaLectura() {
        return FechaLectura;
    }

    public void setFechaLectura(GregorianCalendar FechaLectura) {
        this.FechaLectura = FechaLectura;
    }

    @Override
    public String toString() {
        return super.toString()+"\r\nTribunal=" + Tribunal + "\r\n Entidad=" + Entidad + "\r\n Departamento=" + Departamento + "\r\n Calificacion=" + Calificacion;
    }

    
}
