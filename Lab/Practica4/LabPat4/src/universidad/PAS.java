package universidad;

class PAS implements Personal {

    private Handler _identificador;
    private String _seccion;
    private String _cargo;

    public PAS(Handler identificador, String seccion, String cargo)
            throws BadFormatException {
        _identificador = identificador;
        _seccion = seccion;
        _cargo = cargo;
    }

    @Override
    public Handler obtenerIdentificador() {
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
            if (_identificador.compareTo(otro.obtenerIdentificador()) == 0) {
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
