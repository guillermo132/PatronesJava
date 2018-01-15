/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import Clases.Usuario;
import java.util.ArrayList;

/**
 *
 * @author guillermo
 */
public interface Estrategia {
    /**
     * Ordena lista de alumnos pasada como argumento
     *
     * @param usuarios Lista de alumnos
     * @return 
     */
    public ArrayList<Usuario> ordena(ArrayList<Usuario> usuarios);
}
