package Configuracion;

import java.io.InputStream;
import java.util.Properties;

/**
 * Clase para el acceso a la configuración del entorno. 
 */
public class ConfiguracionEntorno {

    /**
     * Instancia de la clase. Es privada: solo accesible por la propia clase. Es
     * estática: propia de la clase (compartida por los objetos).
     */
    private static ConfiguracionEntorno instancia;

    /**
     * Entorno 
     */
    public final static String ENTORNO = "entorno";

    /**
     * Nombre del servidor
     */
    public final static String SERVIDOR = "servidor";

    /**
     * Entornos (desarrollo, preproducción, producción)
     */
    public final static String ENTORNO_DESA = "desa";
    public final static String ENTORNO_PRE = "pre";
    public final static String ENTORNO_PRO = "pro";

    /**
     * Propiedades.
     */
    private static Properties propiedades;

    /**
     * Constructor privado. No se permite crear instancias de la clase usando new.
     */
    private ConfiguracionEntorno() {
    }

    /**
     * Devuelve la instancia de la clase. Acceso controlado a la única instancia. 
     * @return Instancia de la clase.
     */
    @SuppressWarnings("CallToPrintStackTrace")
    public static ConfiguracionEntorno getInstancia() {
        if (instancia == null) {// Si la instancia es null, se crea.
            instancia = new ConfiguracionEntorno();
            propiedades = new Properties();
            InputStream input;
            input = ConfiguracionEntorno.class.getClassLoader().getResourceAsStream("Configuracion/configuracionEntorno.properties");
            try {
                propiedades.load(input);
                input.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return instancia;
    }

    /**
     * Método de utilidad que permite recuperar un parámetro de configuración del fichero de propiedades.
     * @param propiedad Propiedad a recuperar
     * @return Valor de la propiedad
     */
    public String getPropiedad(String propiedad) {
        return propiedades.getProperty(propiedad);
    }
}
