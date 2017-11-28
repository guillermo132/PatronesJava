package ClientesTienda;

public class Cliente {

    public static void main(String[] args) {
        Factura f = new Factura(73987,"Portatil",885.99, "1pcc", "PcComponetes", "Murcia");
        InterfaceCliente ic = new AdaptadorCliente(f);
        System.out.println(ic.toString());
    }
}
