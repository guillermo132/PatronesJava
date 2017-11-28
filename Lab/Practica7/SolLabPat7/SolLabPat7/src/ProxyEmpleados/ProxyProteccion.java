package ProxyEmpleados;

public class ProxyProteccion implements InterfaceEmpleado {

    private EmpleadosBD empleados = new EmpleadosBD();
    private Empleado emp;

    public ProxyProteccion(Empleado emp) {
        this.emp = emp;
    }

    @Override
    public String informacionEmpleado() {
        Empleado empaux = empleados.getEmpleado(emp.getId());
        String infoTotal;
        if (empaux == null) {
            return "El empleado no existe.";
        } else {
            infoTotal = empaux.informacionEmpleado();
        }

        if (empaux.getId().equals(emp.getId()) && empaux.getContraseña().equals(emp.getContraseña())) {
            return "Empleado: " + infoTotal;
        } else {
            String[] partes = infoTotal.split(" - ");
            StringBuilder infoParcial = new StringBuilder();
            for (int i = 0; i < partes.length - 1; i++) {
                infoParcial.append(partes[i]).append(" - ");
            }
            return "Empleado: " + infoParcial;
        }
    }
}
