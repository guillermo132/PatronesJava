package MaquinaExp;

/**
 * Clase que prueba el patrón State.
 * @author Salvador Oton
 */
public class Cliente {

    public static void main(String[] args) {
        try {
            MaquinaExpendedora maquina = new MaquinaExpendedora(500);
            //1º el usuario mete el dinero
            maquina.introduceDinero(30);
            //2º el usuario selecciona compra
            maquina.seleccionaProducto("1");
            //3ºmaquina retorna cambio
            maquina.devolucionCambio();

            //1º el usuario mete el dinero
            maquina.introduceDinero(30);
            //2º el usuario selecciona compra
            maquina.seleccionaProducto("4");
            //3ºmaquina retorna cambio
            maquina.devolucionCambio();

            //1º el usuario mete el dinero
            maquina.introduceDinero(30);
            //2º el usuario selecciona compra
            maquina.seleccionaProducto("0");
            //3ºmaquina retorna cambio
            maquina.devolucionCambio();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
