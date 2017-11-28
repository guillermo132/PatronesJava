package universidad;

public interface Personal {

    public Handler obtenerIdentificador();

    public void generarNomina();

    public boolean modificar(Personal otro);

    @Override
    public String toString();
}
