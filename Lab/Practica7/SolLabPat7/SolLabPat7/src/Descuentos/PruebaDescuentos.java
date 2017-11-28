package Descuentos;

public class PruebaDescuentos {

    public static void main(String args[]) {
        //descuentos individuales
        DescuentoCantidad d1 = new DescuentoCantidad("Descuento por compra superior a 150 euros.", 15);
        DescuentoCantidad d2 = new DescuentoCantidad("Descuento por compra superior a 50 euros.", 3);
        DescuentoDia d3 = new DescuentoDia("Descuento por miércoles.", 5);
        DescuentoCliente d4 = new DescuentoCliente("Cliente VIP", 8);
        DescuentoCliente d5 = new DescuentoCliente("Trabajador supermercado", 8);
        //descuentos compuestos
        DescuentoCompuesto dc1 = new DescuentoCompuesto("Descuento Compuesto 1. Descuento cliente 1000.", 5);
        DescuentoCompuesto dc2 = new DescuentoCompuesto("Descuento Compuesto 2.", 0);

        //Compra 1
        dc1.añadirDescuento(d1);
        dc1.añadirDescuento(d3);
        dc1.añadirDescuento(d4);
        //Compra 2
        dc2.añadirDescuento(d2);
        dc2.añadirDescuento(d3);
        dc2.añadirDescuento(d5);
        
        System.out.println("Descripción Descuentos Compuestos:\n" + dc1.getDescripcion());
        System.out.println("\nCantidad Descuentos Compuestos:\n" + dc1.getDescuentos() + "\n\n");

        System.out.println("Descripción Descuentos Compuestos:\n" + dc2.getDescripcion());
        System.out.println("\nCantidad Descuentos Compuestos:\n" + dc2.getDescuentos());
    }
}
