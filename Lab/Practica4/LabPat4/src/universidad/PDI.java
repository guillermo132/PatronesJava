package universidad;

public class PDI implements Personal {

    private Handler _identificador;
    private String _departamento;
    private String _area;

    public PDI(Handler identificador, String departamento, String area)
            throws BadFormatException {
        _identificador = identificador;
        _departamento = departamento;
        _area = area;
    }

    @Override
    public Handler obtenerIdentificador() {
        return _identificador;
    }

    public String obtenerDepartamento() {
        return _departamento;
    }

    public String obtenerArea() {
        return _area;
    }

    @Override
    public void generarNomina() {
        System.out.println("Generada nomina de PDI: " + _identificador);
    }

    @Override
    public boolean modificar(Personal otro) {
        boolean ok;

        ok = false;
        try {
            if (_identificador.compareTo(otro.obtenerIdentificador()) == 0) {
                _departamento = ((PDI) otro).obtenerDepartamento();
                _area = ((PDI) otro).obtenerArea();
                ok = true;
            }
        } catch (ClassCastException e) {
            ok = false;
        }
        return ok;
    }

    @Override
    public String toString() {
        return "PDI " + _identificador
                + "\tDepartamento:\t " + _departamento
                + "\tArea        :\t " + _area;
    }
}
