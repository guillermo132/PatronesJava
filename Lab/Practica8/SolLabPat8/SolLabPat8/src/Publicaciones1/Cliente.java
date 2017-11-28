package Publicaciones1;

import java.util.ArrayList;

/**
 * Cliente que prueba el patrón iterador.
 * @author Salvador Oton
 */
public class Cliente {

    public static void main(String arg[]) {
        try {
            // Crea la lista. 
            ArrayList aux = new ArrayList();
            Libro lib1 = new Libro("12345678", "Quijote", "Cervantes", 1605);
            Libro lib2 = new Libro("48438979", "Rimas y Leyendas", "Bécquer", 1868);
            Libro lib3 = new Libro("62654698", "Código Da Vinci", "Brown", 2003);
            Libro lib4 = new Libro("75542987", "POO y Java", "Otón", 2000);
            aux.add(lib1);
            aux.add(lib2);
            aux.add(lib3);
            aux.add(lib4);

            // Crea el agregado.
            Agregado agregado = new AgregadoConcreto(aux);
            // Crea el iterador.
            Iterador iterador = agregado.crearIterador();

            // Recorre la lista con el iterador.
            while (iterador.hayMas()) {
                Libro lib = (Libro) iterador.elementoActual();
                System.out.println(lib.toString());
                iterador.siguiente();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
