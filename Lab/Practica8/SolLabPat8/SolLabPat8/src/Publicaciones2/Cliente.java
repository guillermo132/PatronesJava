package Publicaciones2;

import java.util.ArrayList;

/**
 * Clase que prueba el patrón Strategy.
 * @author Salvador Oton
 */
public class Cliente {

    public static void main(String arg[]) {
        try {
            // Las publicaciones
            ArrayList res = new ArrayList();
            ArrayList aux = new ArrayList();
            Libro lib1 = new Libro("12345678", "Quijote", "Cervantes", 1605);
            Libro lib2 = new Libro("48438979", "Rimas y Leyendas", "Bécquer", 1868);
            Libro lib3 = new Libro("62654698", "Código Da Vinci", "Brown", 2003);
            Libro lib4 = new Libro("75542987", "POO y Java", "Otón", 2000);
            aux.add(lib1);
            aux.add(lib2);
            aux.add(lib3);
            aux.add(lib4);

            //La estrategia inicial por título
            Estrategia est = new EstrategiaConcretaTitulo();
            //El contexto
            Contexto contexto = new Contexto(est, aux);
            System.out.println("\n### Estrategia Titulo:\n");
            res = contexto.ejecutaEstrategia();

            Agregado agregado1 = new AgregadoConcreto(res);
            Iterador iterador1 = agregado1.crearIterador();

            while (iterador1.hayMas()) {
                Libro lib = (Libro) iterador1.elementoActual();
                System.out.println(lib.toString());
                iterador1.siguiente();
            }

            //cambiamos la estrategia por el año de edición
            est = new EstrategiaConcretaAñoEdi();
            contexto.setEstrategia(est);
            System.out.println("\n### Estrategia Año de Edición:\n");
            res = contexto.ejecutaEstrategia();

            Agregado agregado2 = new AgregadoConcreto(res);
            Iterador iterador2 = agregado2.crearIterador();

            while (iterador2.hayMas()) {
                Libro lib = (Libro) iterador2.elementoActual();
                System.out.println(lib.toString());
                iterador2.siguiente();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
