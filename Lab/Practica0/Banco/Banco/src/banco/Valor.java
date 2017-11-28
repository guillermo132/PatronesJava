package banco;

import java.util.GregorianCalendar;

public class Valor implements Rentabilidad {

    private String nombre;
    private double compra;
    private double cotizacion;
    private int titulos;
    private GregorianCalendar fechaCompra;
    private CarteraValores cartera;

    public Valor(String nombre, double compra, double cotizacion, int titulos, CarteraValores cartera) {
        this.compra = compra;
        this.cotizacion = cotizacion;
        this.nombre = nombre;
        this.titulos = titulos;
        this.cartera = cartera;
        this.fechaCompra = new GregorianCalendar();
        this.cartera.addValor(this);
    }

    public Valor(String nombre, double compra, double cotizacion, int titulos, GregorianCalendar fechaCompra, CarteraValores cartera) {
        this.nombre = nombre;
        this.compra = compra;
        this.cotizacion = cotizacion;
        this.titulos = titulos;
        this.fechaCompra = fechaCompra;
        this.cartera = cartera;
        this.cartera.addValor(this);
    }

    @Override
    public double calculaRentabilidad() {
        int dias = numDias();        
        return ((cotizacion - compra) / compra) * (365 / dias) * titulos;
    }

    private int numDias() {
        final long MILISEGS_POR_DIA = 24 * 60 * 60 * 1000;
        GregorianCalendar hoy = new GregorianCalendar();
        long t1 = fechaCompra.getTimeInMillis();
        long t2 = hoy.getTimeInMillis();
        int dias = (int) ((t2 - t1) / MILISEGS_POR_DIA);
        return dias;
    }

}
