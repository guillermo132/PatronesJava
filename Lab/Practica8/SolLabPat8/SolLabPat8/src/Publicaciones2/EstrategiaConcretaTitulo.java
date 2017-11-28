package Publicaciones2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Clase que implementa la interfaz Estrategia.
 * Ordena una lista de publicaciones por título.
 * @author Salvador Oton
 */
public class EstrategiaConcretaTitulo implements Estrategia {

    @Override
    public ArrayList ordena(ArrayList publicaciones) {
        //Comparador para ordenar las publicaciones por su título.
        Comparator TitLibComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Libro lib1 = (Libro) o1;
                Libro lib2 = (Libro) o2;

                return lib1.getTitulo().compareTo(lib2.getTitulo());
            }
        };

        //Ordenamos los objetos del array por el atributo Título
        Collections.sort(publicaciones, TitLibComp);
        return publicaciones;
    }
}
