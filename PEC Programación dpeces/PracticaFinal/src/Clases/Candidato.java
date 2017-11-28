package Clases;

import java.io.Serializable;

public class Candidato implements Serializable{
    
    private String nif;
    private String nombre;
    private String telefono;
    private Direccion direccion;
    private String ocupaciones;
    private String foto;
    private String palabrasClave;
    private String rangoSalarial;
    private int discapacidad;

    

    /**
     *
     * @param nif
     * @param nombre
     * @param telefono
     * @param direccion
     * @param ocupaciones
     * @param foto
     * @param palabrasClave
     * @param rangoSalarial
     * @param discapacidad
     */
    public Candidato(String nif, String nombre, String telefono, Direccion direccion, String ocupaciones, String foto, String palabrasClave, String rangoSalarial, int discapacidad) {
        this.nif = nif;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ocupaciones = ocupaciones;
        this.foto = foto;
        this.palabrasClave = palabrasClave;
        this.rangoSalarial = rangoSalarial;
        this.discapacidad = discapacidad;
    }
    
   
    public String getRangoSalarial() {
        return rangoSalarial;
    }

    public void setRangoSalarial(String rangoSalarial) {
        this.rangoSalarial = rangoSalarial;
    }

    public String getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(String palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    public String getOcupaciones() {
        return ocupaciones;
    }

    public void setOcupaciones(String ocupaciones) {
        this.ocupaciones = ocupaciones;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
    
    public int getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(int discapacidad) {
        this.discapacidad = discapacidad;
    }
    
}
