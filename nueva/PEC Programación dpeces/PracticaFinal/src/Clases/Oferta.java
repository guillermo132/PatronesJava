/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 *
 * @author PeCeS
 */
public class Oferta implements Serializable{
    
    private String nombreEmpresa;
    private Oficina oficinaEmpresa;
    private String ocupacionCNO;
    private String palabrasClave;
    private GregorianCalendar fechaApertura;
    private GregorianCalendar fechaCaducidad;
    private String rangoSalarial;
    private String tiempo;
    private int porcentageDedicacion;
    private String foto;


    //Constructor Oferta a tiempo parcial para añadir la dedicación
    /**
     *
     * @param nombreEmpresa
     * @param oficinaEmpresa
     * @param ocupacionCNO
     * @param palabrasClave
     * @param fechaApertura
     * @param fechaCaducidad
     * @param rangoSalarial
     * @param tiempo
     * @param foto
     * @param porcentageDedicacion
     */
    public Oferta(String nombreEmpresa, Oficina oficinaEmpresa, String ocupacionCNO, String palabrasClave, GregorianCalendar fechaApertura, GregorianCalendar fechaCaducidad, String rangoSalarial, String tiempo, String foto, int porcentageDedicacion) {
        this.nombreEmpresa = nombreEmpresa;
        this.oficinaEmpresa = oficinaEmpresa;
        this.ocupacionCNO = ocupacionCNO;
        this.palabrasClave = palabrasClave;
        this.fechaApertura = fechaApertura;
        this.fechaCaducidad = fechaCaducidad;
        this.rangoSalarial = rangoSalarial;
        this.tiempo = tiempo;
        this.foto = foto;
        this.porcentageDedicacion = porcentageDedicacion;
    }
    
    
    

    /**
     * Get the value of porcentageDedicacion
     *
     * @return the value of porcentageDedicacion
     */
    public int getPorcentageDedicacion() {
        return porcentageDedicacion;
    }

    /**
     * Set the value of porcentageDedicacion
     *
     * @param porcentageDedicacion new value of porcentageDedicacion
     */
    public void setPorcentageDedicacion(int porcentageDedicacion) {
        this.porcentageDedicacion = porcentageDedicacion;
    }


    /**
     * Get the value of tiempo
     *
     * @return the value of tiempo
     */
    public String getTiempo() {
        return tiempo;
    }

    /**
     * Set the value of tiempo
     *
     * @param tiempo new value of tiempo
     */
    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * Get the value of rangoSalarial
     *
     * @return the value of rangoSalarial
     */
    public String getRangoSalarial() {
        return rangoSalarial;
    }

    /**
     * Set the value of rangoSalarial
     *
     * @param rangoSalarial new value of rangoSalarial
     */
    public void setRangoSalarial(String rangoSalarial) {
        this.rangoSalarial = rangoSalarial;
    }


    /**
     * Get the value of fechaCaducidad
     *
     * @return the value of fechaCaducidad
     */
    public GregorianCalendar getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * Set the value of fechaCaducidad
     *
     * @param fechaCaducidad new value of fechaCaducidad
     */
    public void setFechaCaducidad(GregorianCalendar fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }


    /**
     * Get the value of fechaApertura
     *
     * @return the value of fechaApertura
     */
    public GregorianCalendar getFechaApertura() {
        return fechaApertura;
    }

    /**
     * Set the value of fechaApertura
     *
     * @param fechaApertura new value of fechaApertura
     */
    public void setFechaApertura(GregorianCalendar fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    

    /**
     * Get the value of palabrasClave
     *
     * @return the value of palabrasClave
     */
    public String getPalabrasClave() {
        return palabrasClave;
    }

    /**
     * Set the value of palabrasClave
     *
     * @param palabrasClave new value of palabrasClave
     */
    public void setPalabrasClave(String palabrasClave) {
        this.palabrasClave = palabrasClave;
    }


    /**
     * Get the value of ocupacionCNO
     *
     * @return the value of ocupacionCNO
     */
    public String getOcupacionCNO() {
        return ocupacionCNO;
    }

    /**
     * Set the value of ocupacionCNO
     *
     * @param ocupacionCNO new value of ocupacionCNO
     */
    public void setOcupacionCNO(String ocupacionCNO) {
        this.ocupacionCNO = ocupacionCNO;
    }

    
    
    /**
     * Get the value of oficinaEmpresa
     *
     * @return the value of oficinaEmpresa
     */
    public Oficina getOficinaEmpresa() {
        return oficinaEmpresa;
    }

    /**
     * Set the value of oficinaEmpresa
     *
     * @param oficinaEmpresa new value of oficinaEmpresa
     */
    public void setOficinaEmpresa(Oficina oficinaEmpresa) {
        this.oficinaEmpresa = oficinaEmpresa;
    }


    /**
     * Get the value of nombreEmpresa
     *
     * @return the value of nombreEmpresa
     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * Set the value of nombreEmpresa
     *
     * @param nombreEmpresa new value of nombreEmpresa
     */
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    /**
     * Get the value of foto
     *
     * @return the value of foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * Set the value of foto
     *
     * @param foto new value of foto
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
}
