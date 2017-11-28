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
public class Socios {

    public Socios(String Codigosocio, String Nombresocio, String DNI, String Categoria, GregorianCalendar Inscripcion) {
        this.Codigosocio = Codigosocio;
        this.Nombresocio = Nombresocio;
        this.DNI = DNI;
        this.Categoria = Categoria;
        this.Inscripcion = Inscripcion;
     
    }

    private String Codigosocio;

    public String getCodigosocio() {
        return Codigosocio;
    }

    public void setCodigosocio(String Codigosocio) {
        this.Codigosocio = Codigosocio;
    }
    private String Nombresocio;

    public String getNombresocio() {
        return Nombresocio;
    }

    public void setNombresocio(String Nombresocio) {
        this.Nombresocio = Nombresocio;
    }
    private String DNI;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    private String Categoria;

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    private GregorianCalendar Inscripcion;

    public GregorianCalendar getInscripcion() {
        return Inscripcion;
    }

    public void setInscripcion(GregorianCalendar Inscripcion) {
        this.Inscripcion = Inscripcion;
    }

    @Override
    public String toString() {
        return "Socios{" + "Codigosocio=" + Codigosocio + ", Nombresocio=" + Nombresocio + ", DNI=" + DNI + ", Categoria=" + Categoria + ", Inscripcion=" + Inscripcion + '}';
    }

    }

    

