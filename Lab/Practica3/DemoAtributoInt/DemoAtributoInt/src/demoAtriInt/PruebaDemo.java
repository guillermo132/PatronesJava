package demoAtriInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PruebaDemo {

    private static BufferedReader _entrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        AtriInt id; //no tiene que usar dos variables. con la interface vale .
        
        
        System.out.println("Datos persona:");
        System.out.println("Selecciona (1) DNI o (2) NIF:");        
        String opcion = _entrada.readLine();
        if (opcion.equals("1")) {
            System.out.println("Introduce DNI:");
            int num = Integer.parseInt(_entrada.readLine());
            id = new DNI(num);
        } else {
            System.out.println("Introduce NIF:");
            id = new NIF(_entrada.readLine());
        }
        System.out.println("Introduce nombre:");
        String nombre = _entrada.readLine();
        
        Persona p = new Persona(id, nombre);
        System.out.println("Persona: " + p.toString());
    }
}
