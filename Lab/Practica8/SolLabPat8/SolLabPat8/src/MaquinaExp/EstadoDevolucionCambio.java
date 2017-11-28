package MaquinaExp;

/**
 * Estado concreto: Implementa la interfaz Estado. 
 * Implementa el comportamiento específico de un estado.
 * @author Salvador Oton
 */
public class EstadoDevolucionCambio implements Estado {

    @Override
    public void ejecutar(MaquinaExpendedora maquinaExpendedora) {
        double dineroIntroducido = maquinaExpendedora.getDineroIntroducido();
        Producto productoADespachar = maquinaExpendedora.getProductoSeleccionado();
        double precioDelProducto = productoADespachar.getPrecio();
        double cambio = dineroIntroducido - precioDelProducto;
        maquinaExpendedora.actualizaDineroDisponible(-cambio);
        double dineroDisponible = maquinaExpendedora.getDineroDisponible();

        System.out.println("El producto cuesta: " + precioDelProducto
                + "€. \nHa introducido " + dineroIntroducido + "€ su cambio es " + cambio
                + "€ dinero restante en la máquina es " + dineroDisponible + "€\nGracias por su visita.");
    }
}
