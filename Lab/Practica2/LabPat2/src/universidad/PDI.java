package universidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PDI {

    private int _identificador;
    private String _departamento;
    private String _area;

    public PDI(int identificador, String departamento, String area) {
        _identificador = identificador;
        _departamento = departamento;
        _area = area;
    }

    public int obtenerIdentificador() {
        return _identificador;
    }

    public void generarNomina() {
        System.out.println("Generada nomina de PDI " + _identificador);
    }

    public boolean modificar() throws IOException {
        BufferedReader _entrada = new BufferedReader(new InputStreamReader(System.in));
        String linea;

        System.out.println("Nuevo departamento:[" + _departamento + "]");
        linea = _entrada.readLine();
        if (linea.length() != 0) {
            _departamento = linea;
        }

        System.out.println("Nueva area:[" + _area + "]");
        linea = _entrada.readLine();
        if (linea.length() != 0) {
            _area = linea;
        }

        return true;
    }

    public void mostrar() {
        System.out.println("PDI numero " + _identificador);
        System.out.println("\tDepartamento:\t " + _departamento);
        System.out.println("\tArea        :\t " + _area);
    }
}
