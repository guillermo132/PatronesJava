/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod_Strategy;


/**
 *
 * @author doverride
 */
public class FactoriaPublicaciones {
 

    private  String codigo;
    private  String isbn;
    private  String titulo;
    private String autores;

    public FactoriaPublicaciones( String Codigo, String ISBN, String Titulo, String Autores) {
        this.codigo = Codigo;
        this.isbn = ISBN;
        this.titulo = Titulo;
        this.autores = Autores;
    }
    
    //ES REQUESITO QUE: sólo tenga un metodo?
    
//Se diferencia por sobrecarga en los parametros.
    //La idea en la ventana que tengamos tiene 3 cuadros de insercion de textos, sus label van cambiando dependiendo de lo que creemos.
    

    //creaLibros
    public Publicacion getPublicacion(String tipo,String p1, String p2, String p3){
        
        switch(tipo){
            case "Libro":
                return new Libro(p1,p2,p3,codigo,isbn,titulo,autores);
            case "Revista":
                return new Revista(p1,p2,p3,codigo,isbn,titulo,autores);
            default:
                return new Tesis(p1,p2,p3, codigo,isbn,titulo,autores);
                
        
        }
        
       
    }
  


    }
