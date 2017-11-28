package Inmuebles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Constructor concreto. Construye un inmueble de tipo apartamento. 
 */
public class ApartamentoBuilder extends InmuebleBuilder {

    /**
     * Atributo para la lectura de datos de la entrada estándar.
     */
    private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void estableceSuperficie() {
        try {
            System.out.println("Introduce superficie del apartamento:");
            double superficie = Double.parseDouble(entrada.readLine());
            inmueble.setSuperficie(superficie);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
        System.out.println("Superficie del apartamento establecida.");
    }

    @Override
    public void diseñarHabitaciones() {
        try {
            System.out.println("Introduce número de habitaciones del apartamento:");
            int num = Integer.parseInt(entrada.readLine());
            for (int i = 0; i < num; i++) {
                System.out.println("Introduce nombre de habitación del apartamento:");
                Habitacion hab = new Habitacion(entrada.readLine());
                inmueble.setHabitacion(hab);
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
        System.out.println("Habitaciones del apartamento diseñadas.");
    }

    @Override
    public void diseñarSalon() {
        System.out.println("Salón del apartamento diseñado.");
    }

    @Override
    public void diseñarCuartosBaño() {
        try {
            System.out.println("Introduce número de cuartos de baño del apartamento:");
            int num = Integer.parseInt(entrada.readLine());
            for (int i = 0; i < num; i++) {
                System.out.println("Introduce nombre del cuarto de baño del apartamento:");
                CuartoBaño cb = new CuartoBaño(entrada.readLine());
                inmueble.setBaño(cb);
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
        System.out.println("Cuartos de baño del apartamento diseñados.");
    }

    @Override
    public void diseñarTerraza() {
        System.out.println("Terraza del apartamento diseñada.");
    }
}
