/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase UtilSistema 
 */
package AgenciaEmpleo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class UtilSistema implements Serializable {

    //Declaración e inicialización de los atributos propios
    public static ArrayList<Oferta> ofertas = new ArrayList<>();
    public static ArrayList<Candidato> candidatos = new ArrayList<>();
    public static ArrayList<Candidato> candiCasan = new ArrayList<>();
    public static ArrayList<Oferta> oferCasan = new ArrayList<>();

    //Métodos get y set de los atributos
    /**
     *
     * @return
     */
    public static ArrayList<Oferta> getOfertas() {
        return ofertas;
    }

    /**
     *
     * @param ofertas
     */
    public static void setOfertas(ArrayList<Oferta> ofertas) {
        UtilSistema.ofertas = ofertas;
    }

    /**
     *
     * @return
     */
    public static ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    /**
     *
     * @param candidatos
     */
    public static void setCandidatos(ArrayList<Candidato> candidatos) {
        UtilSistema.candidatos = candidatos;
    }

    /**
     *
     * @return
     */
    public static ArrayList<Candidato> getCandiCasan() {
        return candiCasan;
    }

    /**
     *
     * @param candiCasan
     */
    public static void setCandiCasan(ArrayList<Candidato> candiCasan) {
        UtilSistema.candiCasan = candiCasan;
    }

    public static void borrarOfertas() {
        UtilSistema.oferCasan.clear();
    }

    public static void borraCadidatos() {
        UtilSistema.candiCasan.clear();
    }

    /**
     *
     * @return
     */
    public static ArrayList<Oferta> getOferCasan() {
        return oferCasan;
    }

    /**
     *
     * @param oferCasan
     */
    public static void setOferCasan(ArrayList<Oferta> oferCasan) {
        UtilSistema.oferCasan = oferCasan;
    }

    /*Con este metodo podremos realizar los calculos de los intereses
     * Dependiendo de la Discapacidad del Candidato, del Salario Min y Salario MÃ¡x 
     */
    public static boolean compararDatos(Candidato can, Oferta oferta) {
        double min = 0;
        double max = 0;
        //Para facilitar los calculos de cuanto se tributa realizamos una variable de descuento
        int des = 0;
        /*Calculo del sueldo respecto al tipo de jornada 
         * Basicamente tendremos en cuenta jornada de tipo Parcial
         * Ya que a no ser que se indique todos partirÃ¡n de jornada Completa
         */
        if (oferta.tipo.equals("Parcial")) {
            if (oferta.getGrado() < 50) {
                des += 5;
            }
        }

        //Dividimos entre 12 ya que es el salario mensual y nos lo dan anual
        if (oferta.getSalMax() <= 18000) {
            //Se calcula el minimo y maximo de un mes con el descuento
            min = (((oferta.getSalMin() / 12) * 15 - des) / 100) + (oferta.getSalMin() / 12);
            max = (((oferta.getSalMax() / 12) * 15 - des) / 100) + (oferta.getSalMax() / 12);
            //Si el rango esta entre 18000 y 30000
        } else if ((oferta.getSalMin() > 18000) || (oferta.getSalMax() <= 30000)) {
            min = (((oferta.getSalMin() / 12) * 30 - des) / 100) + (oferta.getSalMin() / 12);
            max = (((oferta.getSalMax() / 12) * 30 - des) / 100) + (oferta.getSalMax() / 12);
            //Si el minimo es mayor que 30000
        } else if (oferta.getSalMin() > 30000) {
            min = (((oferta.getSalMin() / 12) * 42 - des) / 100) + (oferta.getSalMin() / 12);
            max = (((oferta.getSalMax() / 12) * 42 - des) / 100) + (oferta.getSalMax() / 12);
        }
        /**
         * Comprobamos que el sueldo mínimo introducido no sea mayor que el
         * sueldo máximo
         */
        if ((can.getSalMin() >= min) || (can.getSalMax() <= max)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Cada vez que introducimos los datos añadimos un nuevo candidato al array
     *
     * @param can
     * @return
     */
    public static boolean AltaCandidato(Candidato can) {
        if (!candidatos.contains(can)) {
            candidatos.add(can);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Si damos al botón 'Eliminar' se los elimina del array
     *
     * @param can
     * @return
     */
    public static boolean BajaCandidato(Candidato can) {
        if (candidatos.contains(can)) {
            candidatos.remove(can);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Cada vez que introducimos los datos añadimos una nueva oferta al array
     *
     * @param ofer
     * @return
     */
    public static boolean AltaOferta(Oferta ofer) {
        if (!ofertas.contains(ofer)) {
            ofertas.add(ofer);
            return true;
        } else {
            return false;
        }

    }

    /**
     *
     * @param ofer
     * @return
     */
    public static boolean BajaOferta(Oferta ofer) {
        if (ofertas.contains(ofer)) {
            ofertas.remove(ofer);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Mediante este método guardamos los datos en un archivo .dat así, si
     * cerramos una ventana los datos de los candidatos y las ofertas permanecen
     */
    public static void guardarDatos() {
       
        try {
            
            //Guardamos los candidatos
            if (!candidatos.isEmpty()) {
                FileOutputStream archivcan = new FileOutputStream("candidatosArray.dat");
                ObjectOutputStream obcan = new ObjectOutputStream(archivcan);
                obcan.writeObject(candidatos); // guardamos en un .dat el arraylist de candidatos
                archivcan.close();
            } else {
                System.out.println("No existen datos de candidatos");
            }
            
            //Guardamos las ofertas
            if (!ofertas.isEmpty()) {
                FileOutputStream archivof = new FileOutputStream("ofertasArray.dat");
                ObjectOutputStream obOf = new ObjectOutputStream(archivof);
                obOf.writeObject(ofertas); // guardamos en un .dat el arraylist de candidato
                archivof.close();
            } else {
                System.out.println("No existen datos de ofertas");
            }


        } catch (IOException ioe) {
            System.out.println("Error de IO: No hay datos o " + ioe.getMessage());
        }
    }

    /**
     * Una vez que se cierra una ventana, o aplicación Se carga de nuevo el
     * archivo .dat donde guardabamos los candidatos y ofertas
     */
    public static void cargarDatos() {
         File fican = new File("candidatosArray.dat");
        File fiof = new File("ofertasArray.dat");
        //Señalamos el arrayList que devolvemos al método
        try {
            //Cargamos los candidatos
            if(fican.exists()){
            FileInputStream archivcan = new FileInputStream("candidatosArray.dat");
            ObjectInputStream lector = new ObjectInputStream(archivcan);
            candidatos = (ArrayList) lector.readObject();
            archivcan.close();
            } else {
            fican.createNewFile();
            }
            //Cargamos las ofertas
            if(fiof.exists()){
            FileInputStream archivof = new FileInputStream("ofertasArray.dat");
            ObjectInputStream lectorOf = new ObjectInputStream(archivof);
            ofertas = (ArrayList) lectorOf.readObject();
            archivof.close();
            }else{
            fiof.createNewFile();
            }
        } catch (IOException ioe) {
            System.out.println("Error IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

    /**
     * En los métodos siguientes realizamos la búsqueda tanto de candidatos para
     * ofertas y viceversa siendo de dos tipos de búsqueda: claves o cno
     */
    
    public static boolean buscarOfertasCno(Candidato can) {
        for (int i = 0; i < can.cno.size(); i++) {
            for (int j = 0; j < ofertas.size(); j++) {
                if (can.cno.get(i).equals(ofertas.get(j).getOcupacion()) && (UtilSistema.compararDatos(can, ofertas.get(j)))) {
                    if (!oferCasan.contains(ofertas.get(j))) {
                        oferCasan.add(ofertas.get(j));
                        ofertas.get(j).setEstadoActual(new EstadoOcupado());
                        
                    }
                }
            }
        }
        if (UtilSistema.oferCasan.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean buscarOfertasClave(Candidato can) {

        for (int i = 0; i < can.getClaves().length; i++) {//Tomamos todas las claves del array
            for (int j = 0; j < ofertas.size(); j++) {//Y el número de ofertas 
                for (int k = 0; k < ofertas.get(j).getClaves().length; k++) {//A su vez, el numero de claves que tiene una oferta
                    if ((can.getClaves()[i].equals(ofertas.get(j).getClaves()[k])) && (UtilSistema.compararDatos(can, ofertas.get(j)))) {
                        if (!oferCasan.contains(ofertas.get(j))) {
                            oferCasan.add(ofertas.get(j));//Si una clave del candidato es igual a una clave de una oferta
                            ofertas.get(j).setEstadoActual(new EstadoOcupado());
                       
                          
                        }                                  //y el rango es verdadero lo añadimos al array de ofertas que casan
                    }

                }

            }
        }
        /*
         * Si no hay ofertas que casen: falso
         */
        if (oferCasan.isEmpty()) {
            return false;
        } else {//Si hay coincidencias: true
            return true;
        }
    }

    /**
     * Ahora buscamos las ofertas que casen para los candidatos o bien por
     * claves, o bien por cno
     *
     * @param of
     * @return
     */
    /**
     * Realizamos primero la búsqueda por cno
     *
     * @param of
     * @return
     */
    public static boolean buscarCandidatoOcupacion(Oferta of) {
        for (int i = 0; i < candidatos.size(); i++) {//Numero de candidatos
            for (int j = 0; j < candidatos.get(i).getCno().size(); j++) {//Numero de ocupaciones de un candidato
                if (of.getOcupacion().equals(candidatos.get(i).getCno().get(j)) && (UtilSistema.compararDatos(candidatos.get(i), of))) {
                    if (!candiCasan.contains(candidatos.get(i))) {
                        candiCasan.add(candidatos.get(i));
                           of.setEstadoActual(new EstadoOcupado());//Si la ocupacion de la oferta es igual a la del candidato 
                           
                    }                                         //y el rango es verdadero se aÃ±ade el candidato a un array de candidatos que casan
                }
            }
        }
        //Si candidatos que casan esta vacio devuelve falso
        if (candiCasan.isEmpty()) {
            return false;

        } else {//Si hay alguna coincidencia es verdadero
            return true;
        }
    }

    /*
     * Realizamos la búsqueda de ofertas por claves
     */
    public static boolean buscarCandidatoClave(Oferta of) {
        for (int i = 0; i < of.getClaves().length; i++) {//Numero de claves de la oferta
            for (int j = 0; j < candidatos.size(); j++) {//Numero de claves del candidato
                for (int k = 0; k < candidatos.get(j).getClaves().length; k++) {
                    if (of.getClaves()[i].equals(candidatos.get(j).getClaves()[k]) && (UtilSistema.compararDatos(candidatos.get(j), of))) {
                        if (!candiCasan.contains(candidatos.get(j))) {
                            candiCasan.add(candidatos.get(j));//Si las claves son iguales y el rango es verdadero 
                            of.setEstadoActual(new EstadoOcupado());
                                                          //Lo aÃ±ade a un array de candidatos que casan
                    }

                }

            }
        }
        }
        //Si el array esta vacio, claramente devuelve falso
        if (candiCasan.isEmpty()) {
            return false;
        } else {//Si no devuelve verdadero
            return true;
        }
    
    }

}
