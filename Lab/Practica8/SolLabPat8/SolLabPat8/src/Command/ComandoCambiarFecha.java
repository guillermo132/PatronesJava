package Command;

import Command.memento.Conserje;
import Command.memento.Originador;
import Command.memento.Recuerdo;

/**
 * Implementa ComandoDeshacer. 
 * Proporciona el comportamiento necesario para cambiar la fecha de una reunión.
 * @author Salvador Oton
 */
public class ComandoCambiarFecha implements ComandoDeshacer {

    // Referencia al receptor.
    private Reunion reunion; 	
    // Gestor de recuerdos.
    private Conserje conserje = new Conserje();   

    @Override
    public Reunion getReunion() {
        return this.reunion;
    }

    @Override
    public void setReunion(Reunion reunion) {
        this.reunion = reunion;
    }

    /**
     * Cambia la fecha de la reunión por otra introducida por el usuario y
     * almacena el valor anterior de la reunión por si luego se quiere recuperar.
     * @param param Nueva fecha de la reunión.
     */
    @Override
    public void ejecutar(String param) {
        Originador originador = new Originador();
        originador.setReunion(reunion);
        conserje.pushRecuerdo(originador.crearRecuerdo());
        reunion.setFecha(new FechaHora(param));
    }

    /**
     * Recupera el valor de la Reunion anterior al introducido por el usuario
     */
    @Override
    public void deshacer() {
        Recuerdo recuerdo = conserje.popRecuerdo();
        if (recuerdo != null){
            Originador originador = new Originador();
            originador.setReunion(reunion);
            conserje.pushRecuerdo(originador.crearRecuerdo());
            reunion.setFecha(recuerdo.getReunion().getFecha()); 
        }
    }

    /**
     * Recupera el valor introducido por el usuario después de que se hubiera deshecho
     */
    @Override
    public void rehacer() {
        Recuerdo recuerdo = conserje.popRecuerdo();
        if (recuerdo != null){
            Originador originador = new Originador();
            originador.setReunion(reunion);
            conserje.pushRecuerdo(originador.crearRecuerdo());
            reunion.setFecha(recuerdo.getReunion().getFecha()); 
        }
    }
}
