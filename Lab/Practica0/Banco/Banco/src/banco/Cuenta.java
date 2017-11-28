package banco;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Cuenta {

    private String num;
    private double saldo;
    private double interes;
    private GregorianCalendar fechaApertura;
    private ArrayList<Cliente> clientes;

    public Cuenta(String num, double saldo, double interes) {
        this.num = num;
        this.saldo = saldo;
        this.interes = interes;
        this.fechaApertura = new GregorianCalendar();
        this.clientes = new ArrayList<>();
    }

}
