/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import Clases.Usuario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author guillermo
 */
public class EstrategiaConcretaNotaMedia implements Estrategia{
    public ArrayList<Usuario> ordena(ArrayList<Usuario> alumnos) {
        //Comparador para ordenar los alumnos por su nombre
        Comparator NomAluComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Usuario uni1 = (Usuario) o1;
                Usuario uni2 = (Usuario) o2;

                return Double.compare(uni2.getNotaMedia(), uni1.getNotaMedia());
            }
        };

        //Ordenamos los objetos del array por el atributo nombre
        Collections.sort(alumnos, NomAluComp);
        return alumnos;
    }
    
}
