
package AprobacionCredito;

/**
 * Cliente: Inicializa la petición a un objeto ManejadorConcreto de la cadena.
 * @author Salvador Oton
 */
public class Cliente {

    public static void main(String arg[]) {
        try {
            //Los manejadores
            Ejecutivo ejecutivo = new Ejecutivo();
            LiderInmediatoEjecutivo liderInmediatoEjecutivo = new LiderInmediatoEjecutivo();
            Gerente gerente = new Gerente();
            Director director = new Director();
            //Los sucesores
            ejecutivo.setSucesor(liderInmediatoEjecutivo);
            liderInmediatoEjecutivo.setSucesor(gerente);
            gerente.setSucesor(director);

            //Gestionamos la aprobación del crédito.
            double cantidad = 200000;
            ejecutivo.solicitudPrestamo(cantidad);
         } catch (Exception e) {
            e.toString();
        }
    }
}

