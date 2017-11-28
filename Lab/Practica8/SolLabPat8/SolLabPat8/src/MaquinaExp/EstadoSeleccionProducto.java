package MaquinaExp;

/**
 * Estado concreto: Implementa la interfaz Estado. 
 * Implementa el comportamiento específico de un estado.
 * @author Salvador Oton
 */
public class EstadoSeleccionProducto implements Estado {
    private Producto productoNulo = new Producto("-1", "Nulo", 0, 0);    

    @Override
    public void ejecutar(MaquinaExpendedora maquinaExpendedora) {
        try {
            Producto productoElegido = maquinaExpendedora.getProductoSeleccionado();
            if (productoElegido == null) {
                throw new ProductoInexistenteException();
            }
            double precioProducto = productoElegido.getPrecio();
            double dineroIntroducido = maquinaExpendedora.getDineroIntroducido();
            if (precioProducto > dineroIntroducido) {
                throw new DineroInsuficienteException("Dinero introducido (" + dineroIntroducido + ") menor al precio del producto: " + precioProducto);
            }
            int cantidad = productoElegido.getCantidad();
            if (cantidad == 0) {
                throw new CantidadInsuficienteException(productoElegido.toString());
            } else {
                productoElegido.setCantidad(--cantidad);
            }
            System.out.println("Producto seleccionado: " + productoElegido.toString());
        } catch (ProductoInexistenteException pie) {
            System.out.println(pie.toString());            
            maquinaExpendedora.setProductoSeleccionado(productoNulo);
        } catch (DineroInsuficienteException die) {
            System.out.println(die.toString());            
            maquinaExpendedora.setProductoSeleccionado(productoNulo);
        } catch (CantidadInsuficienteException cie) {
            System.out.println(cie.toString());            
            maquinaExpendedora.setProductoSeleccionado(productoNulo);
        } catch (Exception e) {
            System.out.println(e.toString());
            maquinaExpendedora.setProductoSeleccionado(productoNulo);
        }

    }
}
