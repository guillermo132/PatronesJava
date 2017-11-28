/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase ServidorFicheros - Patrón Proxy 
 */
package AgenciaEmpleo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * SujetoReal: Es la clase que implementa los servicios reales ofrecidos, puede ser una instancia local o remota. 
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class ServidorFicheros implements Servidor {
    /**
     * Nombre del servidor.
     */
    private String nombre;
    /**
     * Tabla hash de ficheros donde se almacenan pares (id, referencia al fichero físico)
     */
    private HashMap<String, Fichero> ficheros;
    /**
     * Fichero
     */
    private Fichero fich;

    /**
     * Constructor.
     * @param nombre Nombre del servidor.
     */
    public ServidorFicheros(String nombre) {
        this.nombre = nombre;
        ficheros = new HashMap<>();
    }

    /**
     *
     * @param of
     * @throws IOException
     */
    @Override
    public void imprimir(Oferta of) throws IOException {
        //Se guardará en un txt la oficina de la oferta
        try (PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(of.getOficina().getNomOficina() + ".txt")))) {
            String claves = "";
            for (int i = 0; i < of.getClaves().length; i++) {
                claves += of.getClaves()[i] + ",";//Obtiene las claves de la oferta separadas por guion
            }
            salida.println("----------------------FACTURA----------------------");
            salida.println("\n");
            salida.println("\n");
            salida.println("COMPAÑÍA: " + of.getOficina().getNomCompañia());//Nombre de la empresa
            salida.println("\n");
            salida.println("OFICINA ASOCIADA: " + of.getOficina().getNomOficina());//Nombre de la oficina 
            salida.println("\n");
            salida.println("DIRECCIÓN: " + of.getOficina().getDireccion());//Dirección de la oficina
            salida.println("\n");
            salida.println("Tlf: " + of.getOficina().getTlf());
            salida.println("\n");
            salida.println("OCUPACIÓN: " + of.getOcupacion());
            salida.println("\n");
            salida.println("JORNADA: " + of.getTipo());
            if (of.getTipo().equals("Parcial")) {//Si la jornada es de tiempo parcial, mostrarÃ¡ el tiempo de dedicaciÃ³n
                salida.println("TIEMPO DE DEDICACION: " + of.getGrado());
                salida.println("\n");
            }
            salida.println("\n");
            salida.println("SALARIO MÍNIMO: " + of.getSalMin());
            salida.println("\n");
            salida.println("SALARIA MÁXIMO: " + of.getSalMax());
            salida.println("\n");
            salida.println("FECHA INICIO OFERTA: " + of.getFechaAper());
            salida.println("\n");
            salida.println("FECHA CIERRE OFERTA: " + of.getFechaCadu());
            salida.println("\n");
            salida.println("PALABRAS CLAVES: " + claves);
            salida.println("\n");
  
    }
}
}
