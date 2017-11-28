package universidad;

public class PDI implements Personal {

    private int _identificador;
    private String _departamento;
    private String _area;

    public PDI(int identificador, String departamento, String area) {
        _identificador = identificador;
        _departamento = departamento;
        _area = area;
    }

    @Override
    public int obtenerIdentificador() {
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
            if (otro.obtenerIdentificador() == _identificador) {
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
