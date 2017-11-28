package Publicaciones2;

import java.util.ArrayList;

/**
 * Interfaz en la que se definen todos los métodos disponibles para ser manejados por Contexto.
 * @author Salvador Oton
 */
public interface Estrategia {

    /**
     * Ordena lista de publicaciones pasada como argumento.
     * @param publicaciones Lista de publicaciones.
     * @return Lista de publicaciones ordenada.
     */
    public ArrayList ordena(ArrayList publicaciones);
}
