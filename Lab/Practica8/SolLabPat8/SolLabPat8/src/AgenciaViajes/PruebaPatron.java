package AgenciaViajes;

/**
 * Clase que prueba el patrón Template Method.
 * @author Salvador Oton
 */
public class PruebaPatron {

    public static void main(String[] args) {
        //Se crean viajes concretos.
        Viaje viajeA = new PaqueteA();
        Viaje viajeB = new PaqueteB();

        System.out.println("AGENCIA DE VIAJES. PATRON METODO PLANTILLA");
        System.out.println(" ");
        //Se invoca al metodo plantilla con cada objeto Viaje
        System.out.println("Viaje paquete A: ");
        viajeA.hacerViaje();
        System.out.println("\nViaje paquete B: ");
        viajeB.hacerViaje();
    }
}
