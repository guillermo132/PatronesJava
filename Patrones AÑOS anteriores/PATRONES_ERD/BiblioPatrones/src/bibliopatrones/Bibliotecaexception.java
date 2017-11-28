/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliopatrones;

/**
 *
 * @author Estefania
 */
public class Bibliotecaexception extends Exception {
    public static String CODIGO_INTRODUCIDO = "El código ya se encuentra en el sistema";
    public static String CODIGO_INEXISTENTE = "El código no existe";
    public static String CODIGO_BAJA = "El usuario se ha dado de baja";   
    public static String SOCIO_ERRONEO = "El socio introducido es erróneo";
    public static String CODIGO_ERRONEO = "Codigo erroneo";
    public static String USUARIO_ERRONEO = "El usuario introducido no existe";
    public static String PUBLICACION_ALTA = "La publicación dada de alta";
    public static String PUBLICACION_BAJA = "La publicación dada de baja";
    public static String PUBLICACION_MODIFICADA = "La publicación ya está modificada";
    public static String AÑO_SUPER = "Año superior al actual";
    public static String DIA_ERROR = "Dia inexistente";
    public static String MES_ERROR= "Mes inexistente";
    public static String PUBL_PRES = "La publicación se encuentra ya en prestamo";
    public static String PUBL_NOP = "Publicación no prestada";
    public static String PUBL_LIB = "Profesor: Se ha pasado del plazo de devolución del libro";
    public static String PUBL_REV = "Profesor: Se ha pasado del plazo de devolución de la revista";
    public static String PUBL_PRO = "Profesor: Se ha pasado del plazo de devolución del proyecto";
    public static String PUBL_TES = "Profesor: Se ha pasado del plazo de devolución de la tesis";
    public static String PUBL_REVA = "Alumno: Se ha pasado del plazo de devolución de la revista";
    public static String PUBL_PROA = "Alumno: Se ha pasado del plazo de devolución del proyecto";
    public static String PUBL_TESA = "Alumno: Se ha pasado del plazo de devolución de la tesis";
    public static String PUBL_LIBA = "Alumno: Se ha pasado del plazo de devolución del libro";
    public static String PUB_ERROR= "Debe elegir el tipo de publicación";
    
    public Bibliotecaexception(String message) {
        
        super(message);
    }
    
}
