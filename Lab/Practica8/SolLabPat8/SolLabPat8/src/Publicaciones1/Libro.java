package Publicaciones1;

/**
 * Clase que representa un libro.
 * @author Salvador Oton
 */
public class Libro {

    private String isbn;    //ISBN del libro.
    private String titulo;  //Título del libro.
    private String autor;   //Autor del libro.
    private Integer añoedi; //Año de edición del libro.

    /**
     * Constructor.
     * @param isbn ISBN del libro.
     * @param titulo Título del libro.
     * @param autor Autor del libro.
     * @param añoedi Año de edición del libro.
     */
    public Libro(String isbn, String titulo, String autor, Integer añoedi) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.añoedi = añoedi;
    }

    /**
     * Devuelve el ISBN del libro.
     * @return ISBN del libro.
     */
    public String getIsbn() {
        return this.isbn;
    }

    /**
     * Establece el ISBN del libro.
     * @param isbn ISBN del libro.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Devuelve el título del libro.
     * @return Título del libro.
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Establece el título del libro.
     * @param titulo Título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Devuelve el autor del libro.
     * @return Autor del libro.
     */
    public String getAutor() {
        return this.autor;
    }

    /**
     * Establece el autor del libro.
     * @param autor Autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Devuelve el año de edición del libro.
     * @return Año de edición del libro.
     */
    public Integer getAñoedi() {
        return this.añoedi;
    }

    /**
     * Establece el año de edición del libro.
     * @param añoedi Año de edición del libro.
     */
    public void setAñoedi(Integer añoedi) {
        this.añoedi = añoedi;
    }

    /**
     * Devuelve la descripción del libro.
     * @return Descripción del libro.
     */
    @Override
    public String toString() {
        return isbn + " - " + titulo + " # autor: " + autor + " # año edición: " + añoedi;
    }
}
