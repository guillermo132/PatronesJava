/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase AdaptadorSueldo
 */
package AgenciaEmpleo;

import java.text.DecimalFormat;


/**
 * AdaptadorSueldo: Genera el sueldo neto mensual de una oferta 
 * a partir del sueldo maximo de esta
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class AdaptadorSueldo implements Sueldo {

    /**
     * Oferta tiene el sueldo maximo con el que se obtiene el sueldo neto .
     */

    private Oferta o;
 
    /**
     * Constructor
     * @param ofer Oferta .
     */
    public AdaptadorSueldo(Oferta ofer){//Candidato can
        //this.ser = factura;
        this.o= ofer;
    }
     
    /**
     *Método getSueldoNeto genera el sueldo neto mensual de una oferta
     * A partir del sueldo maximo quitandole el irp y entre 12 meses
     * @return sueldo neto
     */
    @Override
    public String getSueldoNeto(){
        //Limitamos el número en dos decimales
        double s = (this.o.getSalMax()/12)*0.76;
            DecimalFormat df = new DecimalFormat("#.##");
            
        return   df.format(s);
        
    }
   
}
