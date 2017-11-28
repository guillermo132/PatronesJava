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
public class Publicaciones {

    private String Codigo;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    private String ISBN;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    private String Titulo;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    private String Autores;

    public String getAutores() {
        return Autores;
    }

    public void setAutores(String Autores) {
        this.Autores = Autores;
    }
    private GregorianCalendar Fechapublicacion;

    public GregorianCalendar getFechapublicacion() {
        return Fechapublicacion;
    }

    public void setFechapublicacion(GregorianCalendar Fechapublicacion) {
        this.Fechapublicacion = Fechapublicacion;
    }
    private String Fotografia;

    public String getFotografia() {
        return Fotografia;
    }

    public void setFotografia(String Fotografia) {
        this.Fotografia = Fotografia;
    }
    private int Paginas;

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }
    private String Coleccion;

    public String getColeccion() {
        return Coleccion;
    }

    public void setColeccion(String Coleccion) {
        this.Coleccion = Coleccion;
    }
    private String Materia;

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }
    private String Observaciones;

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public Publicaciones(String Codigo, String ISBN, String Titulo, String Autores, GregorianCalendar Fechapublicacion, String Fotografia, int Paginas, String Coleccion, String Materia, String Observaciones) {
        this.Codigo = Codigo;
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autores = Autores;
        this.Fechapublicacion = Fechapublicacion;
        this.Fotografia = Fotografia;
        this.Paginas = Paginas;
        this.Coleccion = Coleccion;
        this.Materia = Materia;
        this.Observaciones = Observaciones;
    }

    @Override
    public String toString() {
        return "Codigo=" + Codigo + "\r\n ISBN=" + ISBN + "\r\n Titulo=" + Titulo + "\r\n Autores=" + Autores  +"\r\n Paginas=" + Paginas + "\r\n Coleccion=" + Coleccion + "\r\n Materia=" + Materia + "\r\n Observaciones=" + Observaciones + "\r\n";
    }
    
}
