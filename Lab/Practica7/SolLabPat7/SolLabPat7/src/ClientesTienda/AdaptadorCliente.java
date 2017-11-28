package ClientesTienda;

public class AdaptadorCliente implements InterfaceCliente {

    private Factura factura;

    public AdaptadorCliente(Factura factura) {
        this.factura = factura;
    }

    @Override
    public String getCIF() {
        return this.factura.getCIFCliente();
    }

    @Override
    public String getNombre() {
        return this.factura.getNombreCliente();
    }

    @Override
    public String getDireccion() {
        return this.factura.getDireccionCliente();
    }

    @Override
    public String toString() {
        return "Cliente: " + this.factura.getCIFCliente() + " - " + this.factura.getNombreCliente() + " - " + this.factura.getDireccionCliente();
    }
}
