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
 * @author Guillermo Gomez
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
            salida.println("----------------------TFG----------------------");
            salida.println("\n");
            salida.println("\n");
            salida.println("ID: " + tf.getIdTfg());
            salida.println("\n");
            salida.println("Titulo: " + tf.getTitulo());
            salida.println("\n");
            salida.println("Departamento: " + tf.getDepartamento());
            salida.println("\n");
            salida.println("Grados: " + tf.getGrados());
            salida.println("\n");
            salida.println("Tutor: " + tf.getTutor());
            salida.println("\n");
            salida.println("Descripción: " + tf.getDescripcion());
            salida.println("\n");
            salida.println("Alumno asignado: " + tf.getAlumnoAsignado());
            salida.println("\n");
            salida.println("Requisitos: " + tf.getRequisitos());
            salida.println("\n");

            salida.println("\n");
  
        }
    }
    
}
