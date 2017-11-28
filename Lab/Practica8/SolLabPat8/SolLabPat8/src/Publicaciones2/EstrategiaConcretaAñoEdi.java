package Publicaciones2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Clase que implementa la interfaz Estrategia.
 * Ordena una lista de publicaciones por su año de edición.
 * @author Salvador Oton
 */
public class EstrategiaConcretaAñoEdi implements Estrategia {

    @Override
    public ArrayList ordena(ArrayList publicaciones) {
        //Comparador para ordenar las publicaciones por su año de edición.
        Comparator AñoLibComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Libro lib1 = (Libro) o1;
                Libro lib2 = (Libro) o2;

                return lib1.getAñoedi().compareTo(lib2.getAñoedi());
            }
        };

        //Ordenamos los objetos del array por el atributo Año Edición.
        Collections.sort(publicaciones, AñoLibComp);

        return publicaciones;
    }
}
