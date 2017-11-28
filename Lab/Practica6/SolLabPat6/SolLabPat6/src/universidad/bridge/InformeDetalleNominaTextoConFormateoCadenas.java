package universidad.bridge;

import java.util.Collection;
import java.util.Iterator;
import universidad.Nomina;
import universidad.Personal;
import universidad.adapter.NominaAdapter;

/**
 * Informe detallado en formato texto con 3 columnas (identificador, sueldo, irpf) separadas por punto y coma,
 * donde las columnas sueldo e irpf son cadenas con formato donde el separador de miles es el punto y 
 * el separador de decimales la coma. 
 * @author blozano
 */
public class InformeDetalleNominaTextoConFormateoCadenas implements GeneradorInformesImp{

    @Override
    public String generaInforme(Collection<Personal> personal) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterador = personal.iterator();
        stringBuilder.append("identificador;sueldo;irpf\n");
        while(iterador.hasNext()) {
            Personal persona = (Personal) iterador.next();
            Nomina nomina = persona.getNomina();
            if (nomina != null) {
                NominaAdapter adaptador = new NominaAdapter(nomina);
                stringBuilder.append(persona.obtenerIdentificador());
                stringBuilder.append(";");
                stringBuilder.append(adaptador.getSueldo());
                stringBuilder.append(";");
                stringBuilder.append(adaptador.getIrpf());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
