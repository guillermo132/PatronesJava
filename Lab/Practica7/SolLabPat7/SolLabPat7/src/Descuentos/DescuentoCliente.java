package Descuentos;

public class DescuentoCliente extends Descuento {

    public DescuentoCliente(String tipo, int cantidad) {
        super(tipo, cantidad);
    }

    @Override
    public void añadirDescuento(Descuento d) {
    }

    @Override
    public void eliminarDescuento(Descuento d) {
    }

    @Override
    public int getDescuentos() {
        return this.cantidad;
    }

    @Override
    public String getDescripcion() {
        return "### " + super.toString();
    }
}
