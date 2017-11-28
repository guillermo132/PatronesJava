package ProxyEmpleados;

public class Empleado implements InterfaceEmpleado {

    private String id;
    private String contraseña;
    private String nombre;
    private String departamento;
    private double sueldo;

    public Empleado(String id, String contraseña) {
        this.id = id;
        this.contraseña = contraseña;
    }

    public Empleado(String id, String contraseña, String nombre, String departamento, double sueldo) {
        this.id = id;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.departamento = departamento;
        this.sueldo = sueldo;
    }

    public String getId() {
        return id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String informacionEmpleado() {
        return this.id + " - " + this.nombre + " - " + this.departamento + " - " + this.sueldo;
    }
}
