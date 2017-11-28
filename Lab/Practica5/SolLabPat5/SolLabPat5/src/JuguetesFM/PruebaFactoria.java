package JuguetesFM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PruebaFactoria {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Selecciona juguete (A/C/N): ");
        String tipo = entrada.readLine().toUpperCase();
        System.out.println("Nombre del juguete: ");
        String nombre = entrada.readLine();
        Juguete j;
        FactoriaDeJuguetes fj = new FactoriaDeJuguetes();
        switch (tipo) {
            case "A":
                j = fj.getJuguete(0, nombre);                
                break;
            case "C":
                j = fj.getJuguete(1, nombre);
                break;
            case "N":
                j = fj.getJuguete(2, nombre);
                break;
            default:
                System.out.println("Error, tipo no encontrado");
                return;               
        }
        if (j!=null) {
            j.encender();
            j.apagar();
        }

    }
}
