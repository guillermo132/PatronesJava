package AprobacionCredito;

/**
 * Manejador abstracto para la aprobación del crédito
 * @author Salvador Oton
 */
public abstract class Aprobador {
    // Sucesor en la cadena de responsabilidad.
    private Aprobador sucesor;

    /**
     * Establece el sucesor en la cadena de responsabilidad.
     * @param sucesor Sucesor en la cadena de responsabilidad.
     */
    public void setSucesor(Aprobador sucesor) {
        this.sucesor = sucesor;
    }

    /**
     * Devuelve el sucesor en la cadena de responsabilidad.
     * @return Sucesor en la cadena de responsabilidad.
     */
    public Aprobador getSucesor() {
        return sucesor;
    }  
    
    /**
     * Método para gestionar la aprobación del crédito.
     * @param cantidad Cantidad del crédito solicitado.
     */
    public abstract void solicitudPrestamo(double cantidad);
}
