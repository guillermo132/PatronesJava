package universidad;

public class PAS implements Personal {

    private int _identificador;
    private String _seccion;
    private String _cargo;

    public PAS(int identificador, String seccion, String cargo) {
        _identificador = identificador;
        _seccion = seccion;
        _cargo = cargo;
    }

    @Override
    public int obtenerIdentificador() {
        return _identificador;
    }

    public String obtenerSeccion() {
        return _seccion;
    }

    public String obtenerCargo() {
        return _cargo;
    }

    @Override
    public void generarNomina() {
        System.out.println("Generada nomina de PAS: " + _identificador);
    }

    @Override
    public boolean modificar(Personal otro) {
        boolean ok;

        ok = false;
        try {
            if (otro.obtenerIdentificador() == _identificador) {
                _seccion = ((PAS) otro).obtenerSeccion();
                _cargo = ((PAS) otro).obtenerCargo();
                ok = true;
            }
        } catch (ClassCastException e) {
            ok = false;
        }
        return ok;
    }

    @Override
    public String toString() {
        return "PAS " + _identificador
                + "\tSeccion:\t " + _seccion
                + "\tCargo  :\t " + _cargo;
    }
}
