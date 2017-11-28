package Command.memento;

import Command.Reunion;

/**
 * Clase que crea el objeto recuerdo y lo utiliza para recuperar su estado.
 * Crea un Recuerdo que contiene una instantánea de su estado interno actual. 
 * Usa el Recuerdo para restaurar su estado interno.
 */
public class Originador {

    // Referencia a la reunion.
    private Reunion reunion;

    /**
     * Establece la reunion.
     * @param reunion 
     */
    public void setReunion(Reunion reunion) {
        this.reunion = reunion;
    }

    /**
     * Asigna un recuerdo a la reunion.
     * @param recuerdo 
     */
    public void setRecuerdo(Recuerdo recuerdo) {
        reunion = recuerdo.getReunion();
    }

    /**
     * Devuelve un recuerdo creado a partir de la reunion actual.
     * @return 
     */
    public Recuerdo crearRecuerdo() {
        return new Recuerdo(new Reunion(reunion));
    }
}
