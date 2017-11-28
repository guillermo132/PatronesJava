package JuguetesFM;

/**
 * Creador. Factoría de juguetes. Clase que crea diferentes tipos de juguete. 
 */
public class FactoriaDeJuguetes {

    /**
     * Constantes
     */
    public static final int AVION = 0;
    public static final int COCHE = 1;
    public static final int NAVE = 2;

    /**
     * Crea un tipo de juguete concreto.
     * @param tipo Tipo de juguete a crear.
     * @param nombre Nombre del juguete.
     * @return Juguete concreto.
     */
    public Juguete getJuguete(int tipo, String nombre) {
        switch (tipo) {
            case AVION:
                return new Avion(nombre);
            case COCHE:
                return new Coche(nombre);
            case NAVE:
                return new NaveEsp(nombre);            
            default:
                return null;
        }
    }
}
