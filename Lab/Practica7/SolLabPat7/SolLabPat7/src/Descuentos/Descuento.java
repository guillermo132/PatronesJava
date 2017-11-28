package Descuentos;

public abstract class Descuento {

    protected String tipo;
    protected int cantidad;

    public Descuento(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String nuevo) {
        this.tipo = nuevo;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int nuevo) {
        this.cantidad = nuevo;
    }

    @Override
    public String toString() {
        return "Tipo: " + this.tipo + " - Cantidad: " + this.cantidad;
    }

    public abstract void añadirDescuento(Descuento d);

    public abstract void eliminarDescuento(Descuento d);

    public abstract int getDescuentos();

    public abstract String getDescripcion();
}
