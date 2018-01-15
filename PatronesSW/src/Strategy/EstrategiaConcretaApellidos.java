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
public class EstrategiaConcretaApellidos implements Estrategia{
    public ArrayList<Usuario> ordena(ArrayList<Usuario> alumnos) {
        //Comparador para ordenar los alumnos por su nombre
        Comparator NomAluComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Usuario uni1 = (Usuario) o1;
                Usuario uni2 = (Usuario) o2;

                return uni1.getApellidos().compareTo(uni2.getApellidos());
            }
        };

        //Ordenamos los objetos del array por el atributo nombre
        Collections.sort(alumnos, NomAluComp);
        return alumnos;
    }
}
