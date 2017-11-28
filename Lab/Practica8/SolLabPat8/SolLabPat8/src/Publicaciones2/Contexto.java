package Publicaciones2;

import java.util.ArrayList;

/**
 * Clase que utiliza las diferentes estrategias para las distintas tareas.
 * Mantiene una referencia a la instancia Estrategia que usa, y tiene un método
 * para reemplazar la actual instancia de Estrategia.
 * @author Salvador Oton
 */
public class Contexto {

    private Estrategia estrategia; // Estrategia que se usa.
    private ArrayList publicaciones; // Lista de publicaciones.

    /**
     * Constructor.
     * @param e Estrategia que se usa.
     * @param p Lista de publicaciones.
     */
    public Contexto(Estrategia e, ArrayList p) {
        this.estrategia = e;
        this.publicaciones = p;
    }

    /**
     * Establece la estrategia a usar.
     * @param e Estrategia a usar.
     */    
    public void setEstrategia(Estrategia e) {
        this.estrategia = e;
    }

    /**
     * Ejecuta la estrategia.
     * @return Lista de publicaciones ordenada.
     */
    public ArrayList ejecutaEstrategia() {
        return estrategia.ordena(publicaciones);
    }
}
