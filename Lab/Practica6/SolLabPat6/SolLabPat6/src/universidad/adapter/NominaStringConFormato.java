package universidad.adapter;

/**
 * Interfaz para manejar las cantidades de la nómina como cadenas con formato. 
 */
public interface NominaStringConFormato {

    /**
     * Devuelve el sueldo como una cadena formateada.
     * @return Sueldo formateado.
     */
    public String getSueldo();

    /**
     * Devuelve el irpf como una cadena formateada.
     * @return Irpf formateado.
     */
    public String getIrpf();
}
