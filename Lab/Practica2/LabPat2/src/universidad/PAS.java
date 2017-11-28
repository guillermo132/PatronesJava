package universidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PAS {

    private int _identificador;
    private String _seccion;
    private String _cargo;

    public PAS(int identificador, String seccion, String cargo) {
        _identificador = identificador;
        _seccion = seccion;
        _cargo = cargo;
    }

    public int obtenerIdentificador() {
        return _identificador;
    }

    public void generarNomina() {
        System.out.println("Generada nomina de PAS " + _identificador);
    }

    public boolean modificar() throws IOException {        
        BufferedReader _entrada = new BufferedReader(new InputStreamReader(System.in));
        String linea;        

        System.out.println("Nueva seccion:[" + _seccion + "]");
        linea = _entrada.readLine();
        if (linea.length() != 0) {
            _seccion = linea;
        }

        System.out.println("Nuevo cargo:[" + _cargo + "]");
        linea = _entrada.readLine();
        if (linea.length() != 0) {
            _cargo = linea;
        }

        return true;
    }

    public void mostrar() {
        System.out.println("PAS numero " + _identificador);
        System.out.println("\tSeccion:\t " + _seccion);
        System.out.println("\tCargo  :\t " + _cargo);
    }
}
