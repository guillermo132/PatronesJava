package banco;

import java.util.GregorianCalendar;

public class TarjetaCredito {

    private GregorianCalendar fechaCaducidad;
    private long num;
    private String tipo;
    private String titular;
    private CuentaCorriente cuenta;

    public TarjetaCredito(GregorianCalendar fechaCaducidad, long num, String tipo, String titular, CuentaCorriente cuenta) {
        this.fechaCaducidad = fechaCaducidad;
        this.num = num;
        this.tipo = tipo;
        this.titular = titular;
        this.cuenta = cuenta;
    }

}
