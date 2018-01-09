/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import Clases.*;
import Proxy.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 *
 * @author ivanparrillalopez
 */
public class ImprimirFichero implements Servidor {

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
    public ImprimirFichero(String nombre) {
        this.nombre = nombre;
        ficheros = new HashMap<>();
    }

    public void imprimir(Tfg tf) throws IOException {
       try (PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(tf.getTitulo()+ ".txt")))) {
           
//            salida.println("----------------------Candidato----------------------");
//            salida.println("\n");
//            salida.println("\n");
//            salida.println("NIF: " + o.getNif());
//            salida.println("\n");
//            salida.println("Nombre: " + o.getNombre());
//            salida.println("\n");
//            salida.println("TLF: " + o.getTelefono());
//            salida.println("\n");
//            salida.println("DIRECCIÓN: " + o.getDireccion());
//            salida.println("\n");
//            salida.println("OCUPACIÓN: " + o.getOcupaciones());
//            salida.println("\n");
//            salida.println("RANGO SALARIAL: " + o.getRangoSalarial());
//            salida.println("\n");
//
//            salida.println("PALABRAS CLAVES: " + o.getPalabrasClave());
//            salida.println("\n");
  
    }
    }
    
}
