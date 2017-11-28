package Descuentos;

import java.util.ArrayList;

public class DescuentoCompuesto extends Descuento {

    ArrayList<Descuento> descuentos;

    public DescuentoCompuesto(String tipo, int cantidad) {
        super(tipo, cantidad);
        descuentos = new ArrayList();
    }

    @Override
    public void añadirDescuento(Descuento d) {
        descuentos.add(d);
    }

    @Override
    public void eliminarDescuento(Descuento d) {
        descuentos.remove(d);
    }

    //cantidad de los descuentos
    @Override
    public int getDescuentos() {
        int sum = this.cantidad;
        //añadimos la cantidad de descuentos
        for (int i = 0; i < descuentos.size(); i++) {
            sum += (descuentos.get(i)).getCantidad();
        }
        return sum;
    }

    //descripción de los descuentos
    @Override
    public String getDescripcion() {
        String desc = super.toString();
        //añadimos la descripción de los descuentos
        for (int i = 0; i < descuentos.size(); i++) {
            desc += "\n\t### " + (descuentos.get(i)).getDescripcion();
        }
        return desc;
    }
}
