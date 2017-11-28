package ClientesTienda;

import java.util.GregorianCalendar;

public class Factura {

    private int numero;
    private String concepto;
    private double importe;
    private GregorianCalendar fecha;
    //datos cliente
    private String CIFCliente;
    private String nombreCliente;
    private String direccionCliente;

    public Factura(int numero, String concepto, double importe, String CIFCliente, String nombreCliente, String direccionCliente) {

        this.CIFCliente = CIFCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.importe = importe;
        this.fecha = new GregorianCalendar();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public String getCIFCliente() {
        return CIFCliente;
    }

    public void setCIFCliente(String CIFCliente) {
        this.CIFCliente = CIFCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
}
