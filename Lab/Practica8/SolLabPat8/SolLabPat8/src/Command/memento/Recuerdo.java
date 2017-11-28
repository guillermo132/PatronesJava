package Command.memento;

import Command.Reunion;

/**
 * Almacena el estado interno de un objeto Originador.
 * @author Salvador Oton
 */
public class Recuerdo {

    // Reunión que se va a recordar.
    private Reunion reunion = null;

    /**
     * Constructor.
     * @param reunion Reunión que se va a recordar.
     */
    public Recuerdo(Reunion reunion) {
        this.reunion = reunion;
    }

    /**
     * Devuelve la reunion que se va a recordar.
     * @return Reunión que se va a recordar.
     */
    public Reunion getReunion() {
        return reunion;
    }

    /**
     * Establece la reunion que se va a recordar.
     * @param reunion Reunión que se va a recordar.
     */
    public void setReunion(Reunion reunion) {
        this.reunion = reunion;
    }
}
