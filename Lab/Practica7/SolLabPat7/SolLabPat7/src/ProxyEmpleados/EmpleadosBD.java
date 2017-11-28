package ProxyEmpleados;

import java.util.HashMap;

public class EmpleadosBD {

    private HashMap<String, Empleado> empleados = new HashMap<>();

    public HashMap<String, Empleado> getEmpleados() {
        return empleados;
    }

    public Empleado getEmpleado(String id) {
        return empleados.get(id);
    }

    public EmpleadosBD() {
        Empleado e1 = new Empleado("1", "1", "Pepe", "Informatica", 2000);
        Empleado e2 = new Empleado("2", "2", "Carmen", "Personal", 1500);
        empleados.put(e1.getId(), e1);
        empleados.put(e2.getId(), e2);
    }
}
