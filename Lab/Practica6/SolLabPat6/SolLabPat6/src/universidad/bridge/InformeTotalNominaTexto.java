package universidad.bridge;

import java.util.Collection;
import java.util.Iterator;
import universidad.Nomina;
import universidad.Personal;

/**
 * Informe resumido en formato texto con el total de todas las nóminas. 
 */
public class InformeTotalNominaTexto implements GeneradorInformesImp{

    @Override
    public String generaInforme(Collection<Personal> personal) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterador = personal.iterator();
        double total = 0;
        stringBuilder.append("totalNominas\n");
        while(iterador.hasNext()) {
            Personal persona = (Personal) iterador.next();
            Nomina nomina = persona.getNomina();
            if (nomina != null){
                total = total + nomina.getSueldo();
            }
        }
        stringBuilder.append(total);
        return stringBuilder.toString();
    }
}
