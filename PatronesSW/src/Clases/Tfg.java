/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author joserra
 */
public class Tfg implements Serializable{
    //Atributos
    String idTfg;
    String departamento;
    String tutor;
    String titulo;
    String descripcion;
    String grados;
    String requisitos;
    String alumnoAsignado;
    
    public Tfg(String idTfg, String departamento, String tutor, String titulo, String descripcion, String grados, String requisitos, String alumnoAsignado){
        this.idTfg = idTfg;
        this.departamento = departamento;
        this.tutor = tutor;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.grados = grados;
        this.requisitos = requisitos;
        this.alumnoAsignado = alumnoAsignado;
    }
    
    public String getIdTfg() {
        return idTfg;
    }

    public void setIdTfg(String idTfg) {
        this.idTfg=idTfg;
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento=departamento;
    }
    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor=tutor;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo=titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion=descripcion;
    }
    public String getGrados() {
        return grados;
    }

    public void setGrados(String grados) {
        this.grados=grados;
    }
    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos=requisitos;
    }
    public String getAlumnoAsignado() {
        return alumnoAsignado;
    }

    public void setAlumnoAsignado(String alumnoAsignado) {
        this.alumnoAsignado=alumnoAsignado;
    }
    
}
