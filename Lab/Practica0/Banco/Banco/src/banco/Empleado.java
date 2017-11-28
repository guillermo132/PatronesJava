package banco;

public class Empleado extends Persona {

    private Sucursal sucursal;

    public Empleado(String direccion, String DNI, String nombre, long telefono, Sucursal sucursal) {
        super(direccion, DNI, nombre, telefono);
        this.sucursal = sucursal;
    }

}
