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
public class Tesis extends ProyectosTesis {

    public Tesis(String Programa, String Tribunal, String Entidad, String Departamento, double Calificacion, GregorianCalendar FechaLectura, String Codigo, String ISBN, String Titulo, String Autores, GregorianCalendar Fechapublicacion, String Fotografia, int Paginas, String Coleccion, String Materia, String Observaciones) {
   super(Tribunal, Entidad, Departamento, Calificacion, FechaLectura, Codigo, ISBN, Titulo, Autores, Fechapublicacion, Fotografia, Paginas, Coleccion, Materia, Observaciones);
        this.Programa = Programa;
    }

    private String Programa;

    public String getPrograma() {
        return Programa;
    }

    public void setPrograma(String Programa) {
        this.Programa = Programa;
    }

    @Override
    public String toString() {
        return super.toString()+ "\r\nPrograma=" + Programa;
    }

    
}
