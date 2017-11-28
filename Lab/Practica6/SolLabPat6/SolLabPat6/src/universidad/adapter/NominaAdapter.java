package universidad.adapter;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import universidad.Nomina;

/**
 * Adaptador de nomina que devuelve cantidades formateadas donde el separador de miles es el punto y el separador de decimales la coma.   
 */
public class NominaAdapter implements NominaStringConFormato{

    // Nomina que se va a adaptar.
    private Nomina adaptable;

    /**
     * Constructor
     * @param adaptable 
     */
    public NominaAdapter(Nomina adaptable) {
        this.adaptable = adaptable;
    }
    
    @Override
    public String getSueldo() {
        return formateaCantidad(adaptable.getSueldo());
    }

    @Override
    public String getIrpf() {
        return formateaCantidad(adaptable.getIrpf());
    }
    
    /**
     * Devuelve una cantidad formateada donde el separador de miles es el punto y el separador de decimales la coma.
     * @param cantidad Cantidad a formatear.
     * @return Cantidad formateada.
     */
    private String formateaCantidad(Double cantidad) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator(',');
        decimalFormatSymbols.setGroupingSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00", decimalFormatSymbols);
        return decimalFormat.format(cantidad);
    }
}
