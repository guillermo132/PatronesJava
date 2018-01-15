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
public class Contexto {
    private Estrategia estrategia; // Estrategia que se usa.
    private ArrayList<Usuario> alumnos; // Lista de alumnos.

    /**
     * Constructor.
     *
     * @param e Estrategia que se usa.
     * @param u Lista de alumnos.
     */
    public Contexto(Estrategia e, ArrayList<Usuario> u) {
        this.estrategia = e;
        this.alumnos = u;
    }

    /**
     * Establece la estrategia a usar.
     *
     * @param e Estrategia a usar.
     */
    public void setEstrategia(Estrategia e) {
        this.estrategia = e;
    }

    /**
     * Ejecuta la estrategia.
     */
    public ArrayList<Usuario> ejecutaEstrategia() {
       return estrategia.ordena(alumnos);
    }
}
