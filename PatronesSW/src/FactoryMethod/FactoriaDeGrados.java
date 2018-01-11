/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

import java.util.ArrayList;

/**
 *
 * @author guillermo
 */
public class FactoriaDeGrados {
    
    public static final String ARQUITECTURA = "Arquitectura";
    public static final String AUTOMATICA = "Automática";
    public static final String BIOMEDICAS = "Ciencias Biomédicas";
    public static final String JURIDICAS = "Ciencias Jurídicas";
    public static final String EDUCACION = "Ciencias de la Educación";
    public static final String ECONOMIA = "Economía";
    public static final String ELECTRONICA = "Electrónica";
    public static final String FISICA = "Física";
    public static final String HISTORIA = "Historia";
    public static final String MEDICINA = "Medicina";
    public static final String QUIMICA = "Química";
    public static final String COMPUTACION = "Ciencias de la Computación";
    
    public static ArrayList<String> getGrados(String tipo){
        ArrayList<String> listaGrados = new ArrayList<String>();
        switch(tipo){
            case ARQUITECTURA:
                listaGrados.add("Composición Arquitectónica");
                listaGrados.add("Proyectos Arquitectónicos");
                break;
            case AUTOMATICA:
                listaGrados.add("Ingeniería de Sistemas y Automática");
                listaGrados.add("Ingeniería Telemática");
                break;
            case BIOMEDICAS:
                listaGrados.add("Educación Física y Deportiva");
                listaGrados.add("Farmacia y Tecnología Farmacéutica");
                listaGrados.add("Toxicología");
                break;
            case JURIDICAS:
                listaGrados.add("Derecho");
                listaGrados.add("Ciencia Política y de la Administración");
                break;
            case EDUCACION:
                listaGrados.add("Música");
                listaGrados.add("Didáctica y Organización Escolar");
                listaGrados.add("Psicología Evolutiva y de la Educación");
                break;
            case ECONOMIA:
                listaGrados.add("Economía aplicada");
                listaGrados.add("Sociología");
                listaGrados.add("Fundamentos del Análisis Económico");
                break;
            case ELECTRONICA:
                listaGrados.add("Tecnología Electrónica");
                break;
            case FISICA:
                listaGrados.add("Física");
                listaGrados.add("Álgebra");
                listaGrados.add("Matemática Aplicada");
                break;
            case HISTORIA:
                listaGrados.add("Historia");
                listaGrados.add("Filosofía");
                listaGrados.add("Arqueología");
                break;
            case MEDICINA:
                listaGrados.add("Medicina");
                listaGrados.add("Anatomía Patológica");
                listaGrados.add("Psiquiatría");
                break;
            case QUIMICA:
                listaGrados.add("Ingeniería Química");
                listaGrados.add("Química Analítica");
                listaGrados.add("Química Física");
                break;
            case COMPUTACION:
                listaGrados.add("Proyectos de Ingeniería");
                listaGrados.add("Lenguaje y Sistemas Informáticos");
                listaGrados.add("Ciencia de la Computación e Intelig. ArtificialS");
                break;
        }
        return listaGrados;
    }
    
    
    
}
