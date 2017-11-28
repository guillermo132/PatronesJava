package universidad.bridge;

import java.util.Collection;
import java.util.Iterator;
import universidad.Nomina;
import universidad.Personal;

/**
 * Informe detallado en formato XML 
 */
public class InformeDetalleNominaXml implements GeneradorInformesImp {

    @Override
    public String generaInforme(Collection<Personal> personal) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterador = personal.iterator();
        stringBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        stringBuilder.append("<nominas>\n");
        while(iterador.hasNext()) {
            Personal persona = (Personal) iterador.next();
            Nomina nomina = persona.getNomina();
            if (nomina != null) {
                stringBuilder.append("\t<nomina>\n");
                stringBuilder.append("\t\t<identificador>");
                stringBuilder.append(persona.obtenerIdentificador());
                stringBuilder.append("</identificador>\n");
                stringBuilder.append("\t\t<sueldo>");
                stringBuilder.append(nomina.getSueldo());
                stringBuilder.append("</sueldo>\n");
                stringBuilder.append("\t\t<irpf>");
                stringBuilder.append(nomina.getIrpf());
                stringBuilder.append("</irpf>\n");
                stringBuilder.append("\t</nomina>\n");
            }
        }
        stringBuilder.append("</nominas>\n");
        return stringBuilder.toString();
    }
}
