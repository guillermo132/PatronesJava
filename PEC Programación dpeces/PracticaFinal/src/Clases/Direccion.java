/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author PeCeS
 */
public class Direccion implements Serializable{
    
    private String via;
    private int numero;
    private String pisoLetra;
    private String localidad;
    private String codPostal;

    
    //Constructor de Dirección
    /**
     *
     * @param via
     * @param numero
     * @param pisoLetra
     * @param localidad
     * @param codPostal
     */
    public Direccion(String via, int numero, String pisoLetra, String localidad, String codPostal) {
        this.via = via;
        this.numero = numero;
        this.pisoLetra = pisoLetra;
        this.localidad = localidad;
        this.codPostal = codPostal;
    }

    
    
    /**
     * Get the value of pisoLetra
     *
     * @return the value of pisoLetra
     */
    public String getPisoLetra() {
        return pisoLetra;
    }

    /**
     * Set the value of pisoLetra
     *
     * @param pisoLetra new value of pisoLetra
     */
    public void setPisoLetra(String pisoLetra) {
        this.pisoLetra = pisoLetra;
    }


    /**
     * Get the value of numero
     *
     * @return the value of numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Set the value of numero
     *
     * @param numero new value of numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }


    /**
     * Get the value of via
     *
     * @return the value of via
     */
    public String getVia() {
        return via;
    }

    /**
     * Set the value of via
     *
     * @param via new value of via
     */
    public void setVia(String via) {
        this.via = via;
    }

    /**
     * Get the value of codPostal
     *
     * @return the value of codPostal
     */
    public String getCodPostal() {
        return codPostal;
    }

    /**
     * Set the value of codPostal
     *
     * @param codPostal new value of codPostal
     */
    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }


    /**
     * Get the value of localidad
     *
     * @return the value of localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Set the value of localidad
     *
     * @param localidad new value of localidad
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    
   
    
}
