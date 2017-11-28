package universidad.bridge;

import java.util.Collection;
import java.util.Iterator;
import universidad.Nomina;
import universidad.Personal;

/**
 * Informe detallado en formato texto con 3 columnas (identificador, sueldo, irpf) separadas por punto y coma. 
 */
public class InformeDetalleNominaTexto implements GeneradorInformesImp{

    @Override
    public String generaInforme(Collection<Personal> personal) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterador = personal.iterator();
        stringBuilder.append("identificador;sueldo;irpf\n");
        while(iterador.hasNext()) {
            Personal persona = (Personal) iterador.next();
            Nomina nomina = persona.getNomina();
            if (nomina != null) {
                stringBuilder.append(persona.obtenerIdentificador());
                stringBuilder.append(";");
                stringBuilder.append(nomina.getSueldo());
                stringBuilder.append(";");
                stringBuilder.append(nomina.getIrpf());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
