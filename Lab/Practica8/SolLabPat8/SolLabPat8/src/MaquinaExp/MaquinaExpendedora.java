package MaquinaExp;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Contexto: Clase que mantiene una referencia al estado actual y es la interfaz
 * que utilizan los clientes. Delega todas las llamadas a los métodos
 * específicos del estado en el objeto Estado actual.
 * @author Salvador Oton
 */
public class MaquinaExpendedora {

    private ArrayList<Estado> estados; // Lista de estados.
    private HashMap<String, Producto> productos; // Tabla hash de productos
    private double dineroDisponible; // Dinero disponible en la máquina.
    private double dineroIntroducido; // Dinero introducido en la máquina
    private Producto productoSeleccionado; // Producto seleccionado.
    private Estado estadoActual; // Estado actual.
    // Constantes.
    public static final int ACCION_METERDINERO = 0;
    public static final int ACCION_SELECCIONPRODUCTO = 1;
    public static final int ACCION_DEVOLUCIONCAMBIO = 2;

    /**
     * Constructor.
     * @param dineroDisponible Dinero disponible en la máquina.
     */
    public MaquinaExpendedora(double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
        introduceEstados();
        introduceProductos();
    }

    /**
     * Añade a la lista de estados los posibles estados de la máquina.
     */
    private void introduceEstados() {
        this.estados = new ArrayList<Estado>();
        Estado e0 = new EstadoRecepcionDinero();
        Estado e1 = new EstadoSeleccionProducto();
        Estado e2 = new EstadoDevolucionCambio();
        this.estados.add(e0);
        this.estados.add(e1);
        this.estados.add(e2);
    }

    /**
     * Añade a la tabla hash los productos disponibles en la máquina.
     */
    private void introduceProductos() {
        this.productos = new HashMap<String, Producto>();
        Producto p1 = new Producto("1", "cola", 1.5, 25);
        Producto p2 = new Producto("2", "pastelito", 2, 20);
        Producto p3 = new Producto("3", "patatas", 2.5, 15);
        Producto p4 = new Producto("4", "agua", 1, 0);
        this.productos.put(p1.getId(), p1);
        this.productos.put(p2.getId(), p2);
        this.productos.put(p3.getId(), p3);
        this.productos.put(p4.getId(), p4);
    }

    /**
     * ACCION QUE CAMBIA EL ESTADO DEL CONTEXTO
     * Acción de introducir el dinero en la máquina
     * @param dinero
     * @throws Exception 
     */
    public void introduceDinero(int dinero) throws Exception {
        this.dineroIntroducido = dinero;
        //Actualiza el estado del contexto
        this.estadoActual = this.estados.get(ACCION_METERDINERO);
        //La ejecución de la acción se realiza automáticamente sin necesidad de confirmación
        //por parte del usuario --> justo después de actualizar el estado ejecuto la acción
        //demandada
        this.estadoActual.ejecutar(this);
    }

    /**
     * ACCION QUE CAMBIA EL ESTADO DEL CONTEXTO
     * Acción de seleccionar un producto de la máquina
     * @param idProductoElegido
     * @throws Exception 
     */
    public void seleccionaProducto(String idProductoElegido) throws Exception {
        this.productoSeleccionado = this.productos.get(idProductoElegido);
        //Actualiza el estado del contexto
        this.estadoActual = this.estados.get(ACCION_SELECCIONPRODUCTO);
        //La ejecución de la acción se realiza automáticamente sin necesidad de confirmación
        //por parte del usuario --> justo después de actualizar el estado ejecuto la acción
        //demandada
        this.estadoActual.ejecutar(this);
    }

    /**
     * ACCION QUE CAMBIA EL ESTADO DEL CONTEXTO
     * acción de devolver el cambio
     * @throws Exception 
     */
    public void devolucionCambio() throws Exception {
        //Actualiza el estado del contexto
        this.estadoActual = this.estados.get(ACCION_DEVOLUCIONCAMBIO);
        //La ejecución de la acción se realiza automáticamente sin necesidad de confirmación
        //por parte del usuario --> justo después de actualizar el estado ejecuto la acción
        //demandada
        this.estadoActual.ejecutar(this);
    }

    /**
     * Actualiza la cantidad de dinero disponible.
     * @param cantidad 
     */
    public void actualizaDineroDisponible(double cantidad) {
        this.dineroDisponible += cantidad;
    }

    /**
     * Devuelve la cantidad de dinero introducido.
     * @return Cantidad de dinero introducido.
     */
    public double getDineroIntroducido() {
        return dineroIntroducido;
    }

    /**
     * Establece la cantidad de dinero introducido.
     * @param dineroIntroducido Cantidad de dinero introducido.
     */
    public void setDineroIntroducido(double dineroIntroducido) {
        this.dineroIntroducido = dineroIntroducido;
    }

    /**
     * Devuelve la cantidad de dinero disponible.
     * @return Cantidad de dinero disponible.
     */
    public double getDineroDisponible() {
        return dineroDisponible;
    }

    /**
     * Establece la cantidad de dinero disponible.
     * @param dineroDisponible Cantidad de dinero disponible.
     */
    public void setDineroDisponible(double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    /**
     * Devuelve el producto seleccionado.
     * @return Producto seleccionado.
     */
    public Producto getProductoSeleccionado() {
        return productoSeleccionado;
    }

    /**
     * Establece el producto seleccionado.
     * @param productoSeleccionado Producto seleccionado.
     */
    public void setProductoSeleccionado(Producto productoSeleccionado) {
        this.productoSeleccionado = productoSeleccionado;
    }

    /**
     * Establece el producto seleccionado.
     * @param idProducto Identificador del producto.
     */
    public void setProductoSeleccionado(String idProducto) {
        this.productoSeleccionado = productos.get(idProducto);
    }

    /**
     * Devuelve la tabla hash de productos.
     * @return Tabla hash de productos.
     */
    public HashMap getProductos() {
        return productos;
    }

    /**
     * Añade producto a la tabla hash de productos.
     * @param prod Producto.
     */
    public void addProducto(Producto prod) {
        this.productos.put(prod.getId(), prod);
    }

    /**
     * Devuelve la lista de estados.
     * @return Lista de estados.
     */
    public ArrayList getEstados() {
        return estados;
    }

    /**
     * Establece la lista de estados.
     * @param estados Lista de estados.
     */
    public void setEstados(ArrayList estados) {
        this.estados = estados;
    }
}
