package Facade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doverride
 */
public class ImpresoraGlobal {
    
    private int cantidad;
    private String tipoDoc;
    private String texto;
    private boolean color;

    public ImpresoraGlobal(int cantidad, String tipoDoc, String texto, boolean color) {
        this.cantidad = cantidad;
        this.tipoDoc = tipoDoc;
        this.texto = texto;
        this.color = color;

    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    
    public void imprimir(){
        String bnC = (isColor()) ? "Color" : "Blanco/negro"; 
        
        System.out.println("Enviando a impresión "+cantidad+" copias con el texto: <"+texto+"> en "+bnC+" con formato "+tipoDoc+" .");
        
        
    }
   
}
