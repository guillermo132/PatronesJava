package ProxyEmpleados;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cliente {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        ProxyProteccion proxy;

        String id, pass;
        System.out.println("Introduzca el identificador del empleado:");
        id = entrada.readLine();
        System.out.println("Introduzca la contraseña del empleado:");
        pass = entrada.readLine();

        Empleado emp = new Empleado(id, pass);
        proxy = new ProxyProteccion(emp);
        System.out.println(proxy.informacionEmpleado());
    }
}
