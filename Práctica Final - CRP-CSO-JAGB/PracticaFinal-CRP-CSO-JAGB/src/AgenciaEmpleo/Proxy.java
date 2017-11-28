/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Proxy - Patrón Proxy 
 */
package AgenciaEmpleo;

import java.io.IOException;

/**
 * Proxy: Ofrece una interfaz equivalente al de la clase SujetoReal, y redirige las llamadas de los métodos al objeto real. 
 * Puede realizar un pre-procesamiento y un post-procesamiento sobre los servicios ofrecidos por la clase real.  
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class Proxy implements Servidor {

    /**
     * Referencia al servidor real.
     */
    private Servidor serv;

    /**
     * Constructor.
     * @param serv Servidor real.
     */
    public Proxy(Servidor serv) {
        this.serv = serv;
    }

    /**
     * Establece el servidor real.
     * @param serv Servidor real.
     */
    public void setServidor(Servidor serv) {
        this.serv = serv;
    }

    /**
     * Devuelve el servidor real.
     * @return Servidor real.
     */
    public Servidor getServidor() {
        return serv;
    }

    /**
     * imprime la oferta en un fichero
     * @param o
     * @throws IOException
     */
    @Override
    public void imprimir(Oferta o) throws IOException {
        serv.imprimir(o);
    }
}
