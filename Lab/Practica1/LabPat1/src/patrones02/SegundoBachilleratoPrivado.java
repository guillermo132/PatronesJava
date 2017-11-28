package patrones02;

import java.util.ArrayList;

public class SegundoBachilleratoPrivado extends Titulacion {

    public SegundoBachilleratoPrivado(String nombre) {
        super(nombre);
    }    

    @Override
    public void calculaMatricula() {
        double total = 0;
        ArrayList<Asignatura> listaAsignaturas = super.getAsignaturas();
        for (Asignatura asignatura : listaAsignaturas) {
            total += asignatura.getCreditos() * asignatura.getPrecioCredito();
        }
        System.out.println(super.getNombre() + "\tPrecio matrícula: " + total);
    }
}
