package Configuracion;

public class Prueba {
    
    /**
     * Método de arranque del programa.
     * @param args 
     */ 
    public static void main(String[] args) {
        ConfiguracionEntorno instancia = ConfiguracionEntorno.getInstancia();
        String entorno = instancia.getPropiedad(ConfiguracionEntorno.ENTORNO);
        switch (entorno.toLowerCase()) {
            case ConfiguracionEntorno.ENTORNO_DESA:
                System.out.println("Entorno: desarrollo");
                break;
            case ConfiguracionEntorno.ENTORNO_PRE:
                System.out.println("Entorno: preproducción");
                break;
            case ConfiguracionEntorno.ENTORNO_PRO:
                System.out.println("Entorno: producción");
                break;
            default:
                System.out.println("entorno desconocido.");
                break;
        }
        
        System.out.println("Servidor: " + instancia.getPropiedad(ConfiguracionEntorno.SERVIDOR));
    }    
}
