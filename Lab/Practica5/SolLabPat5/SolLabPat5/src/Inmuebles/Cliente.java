package Inmuebles;

/**
 * Cliente: Crea el objeto Director y lo configura con el objeto Constructor deseado. 
 */
public class Cliente {

    public static void main(String[] args) {
        Inmueble inmueble; // Producto complejo a crear.
        Arquitecto arquitecto = new Arquitecto();// Director que construirá el producto complejo.
        InmuebleBuilder ab = new  ApartamentoBuilder();// Constructor concreto para apartamento.
        InmuebleBuilder cb = new ChaletBuilder();// Constructor concreto para chalet.
        
        // Creación de apartamento.
        arquitecto.setInmuebleBuilder(ab);// El director establece/configura el constructor concreto del producto a construir.
        arquitecto.diseñarInmueble();// El director crea el producto.
        inmueble = arquitecto.getInmueble();// El director devuelve el producto.
        System.out.println(inmueble.toString());// Muestra el producto.
        
        // Creación de chalet.
        arquitecto.setInmuebleBuilder(cb);// El director establece/configura el constructor concreto del producto a construir.
        arquitecto.diseñarInmueble();// El director crea el producto.
        inmueble = arquitecto.getInmueble();// El director devuelve el producto.
        System.out.println(inmueble.toString());// Muestra el producto.
    }
}
