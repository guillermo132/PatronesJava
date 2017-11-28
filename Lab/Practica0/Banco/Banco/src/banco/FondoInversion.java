package banco;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class FondoInversion implements Rentabilidad {

    private String nombre;
    private GregorianCalendar fechaSuscripcion;
    private GregorianCalendar fechaReembolso;
    private ArrayList<Activo> activos;

    public FondoInversion(String nombre, GregorianCalendar fechaSuscripcion, GregorianCalendar fechaReembolso) {
        this.nombre = nombre;
        this.fechaSuscripcion = fechaSuscripcion;
        this.fechaReembolso = fechaReembolso;
        this.activos = new ArrayList<>();
    }

    @Override
    public double calculaRentabilidad() {
        double rentabilidad = 0;
        for (Activo activo : activos) {
            rentabilidad += activo.calculaRentabilidad();
        }
        return rentabilidad;
    }

    public void addActivo(Activo a) {
        activos.add(a);
    }
}
