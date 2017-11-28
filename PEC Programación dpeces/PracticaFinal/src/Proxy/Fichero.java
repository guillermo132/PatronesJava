
package Proxy;

import java.io.File;

/**
 *
 * @author ivanparrillalopez
 */
public class Fichero {

    private String id;
    private String nombre;
    private File fichero;
    private long tamaño;
    private static int contador = 0;


    public Fichero(String nombre) {
        this.id = Integer.toString(getContador());
        this.nombre = nombre;
        this.fichero = new File(nombre);
        this.tamaño = fichero.length();
    }


    private static int getContador() {
        return contador++;
    }

    public String getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public File getFichero() {
        return this.fichero;
    }

    @Override
    public String toString() {
        return id + " " + nombre + " # " + tamaño;
    }
}
