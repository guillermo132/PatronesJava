package universidad.bridge;

import java.util.Collection;
import java.util.Iterator;
import universidad.Nomina;
import universidad.Personal;

/**
 * Informe resumido en formato texto con el total de todas las nóminas en XML. 
 */
public class InformeTotalNominaXml implements GeneradorInformesImp{

    @Override
    public String generaInforme(Collection<Personal> personal) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterador = personal.iterator();
        double total = 0;
        stringBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        stringBuilder.append("<totalNominas>\n");
        while(iterador.hasNext()) {
            Personal persona = (Personal) iterador.next();
            Nomina nomina = persona.getNomina();
            if (nomina != null){
                total = total + nomina.getSueldo();
            }
        }
        stringBuilder.append("\t<total>");
        stringBuilder.append(total);
        stringBuilder.append("</total>\n");
        stringBuilder.append("</totalNominas>\n");
        return stringBuilder.toString();
    }
}
