package Descuentos;

import java.util.Enumeration;

public class DescuentoDia extends Descuento {

    public DescuentoDia(String tipo, int cantidad) {
        super(tipo, cantidad);
    }

    @Override
    public void añadirDescuento(Descuento d) {
    }

    @Override
    public void eliminarDescuento(Descuento d) {
    }

    public Enumeration descuentosAplicados() {
        return null;
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
