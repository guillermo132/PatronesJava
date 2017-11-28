package Proxy;

import Clases.Candidato;
import java.io.IOException;

public class ProxyProteccion implements Servidor {


     //Referencia al servidor real.  
    private Servidor serv;

    public ProxyProteccion(Servidor serv) {
        this.serv = serv;
    }
     // Establece el servidor real.

    public void setServidor(Servidor serv) {
        this.serv = serv;
    }
     //Devuelve el servidor real.
  
    public Servidor getServidor() {
        return serv;
    }
    
     //imprime la oferta en un fichero  
  
    @Override
    public void imprimir(Candidato o) throws IOException {
        serv.imprimir(o);
    }
}
