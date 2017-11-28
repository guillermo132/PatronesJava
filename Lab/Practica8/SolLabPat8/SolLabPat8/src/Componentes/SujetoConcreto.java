package Componentes;

import java.util.Observable;

/**
 * Gestiona a sus observadores.
 * Notifica cambios en el precio de un componente.
 * @author Salvador Oton
 */
public class SujetoConcreto extends Observable {
    // Componente monitorizado
    private Componente comp;

    /**
     * Establece componente a monitorizar.
     * @param c Componente a monitorizar.
     */
    public void setComponente(Componente c) {
        this.comp = c;
    }

    /**
     * Modifica precio del componente.
     * @param p Nuevo precio del componente.
     */
    public void cambiaPrecio(double p) {
        comp.setPrecio(p);
        setChanged();
        notifyObservers();
    }

    /**
     * Devuelve componente monitorizado.
     * @return Componente monitorizado.
     */
    public Componente getComponente() {
        return this.comp;
    }
}
