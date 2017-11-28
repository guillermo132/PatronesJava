/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.io.*;
import java.util.*;

/**
 *
 * @author Estefania
 */
public class Gestionpublicaciones {
    
    private ArrayList<Publicaciones> Gestion;
    
    public Gestionpublicaciones() {
        this.Gestion = new ArrayList();
    }
    

    public ArrayList<Publicaciones> getGestion() {
        return Gestion;
    }

    public void setGestion(ArrayList<Publicaciones> Gestion) {
        this.Gestion = Gestion;
    }

    public void Altapublicaciones(Publicaciones pb) throws Bibliotecaexception {
        Iterator it = this.Gestion.iterator();
        try {
            while (it.hasNext()) {
                Publicaciones p = (Publicaciones) it.next();
                if (p.getCodigo().equals(pb.getCodigo())) {
                    throw new Bibliotecaexception(Bibliotecaexception.CODIGO_INTRODUCIDO);
                }

            }

            this.Gestion.add(pb);

        } catch (Bibliotecaexception b) {
            throw b;

        }
    }

    public void Bajapublicaciones(String Codigo) throws Bibliotecaexception {
        Iterator it = this.Gestion.iterator();
        try {
            while (it.hasNext()) {
                Publicaciones pb = (Publicaciones) it.next();
                if (pb.getCodigo().equals(Codigo)) { //al encontrar el codigo lo borramos del arrayList.
                    this.Gestion.remove(pb);
                    return;


                }

            }
            throw new Bibliotecaexception(Bibliotecaexception.CODIGO_INEXISTENTE);
        } catch (Bibliotecaexception b) {
            throw b;
        }


    }

    public ArrayList<Publicaciones> Consultapublicaciones(String Titulo) {
        ArrayList<Publicaciones> pubencontradas = new ArrayList();
        Iterator it = this.Gestion.iterator();

        while (it.hasNext()) {
            Publicaciones p = (Publicaciones) it.next();
            if (p.getTitulo().equals(Titulo)) {
                pubencontradas.add(p);
            }


        }
        return pubencontradas;
    }

    public void Modificacionpublicaciones(Publicaciones pb) throws Bibliotecaexception {
        Iterator it = this.Gestion.iterator();
        try {
            while (it.hasNext()) {
                Publicaciones p = (Publicaciones) it.next();
                if (p.getCodigo().equals(pb.getCodigo())) {
                    this.Gestion.remove(p);
                    this.Gestion.add(pb);
                    return;
                }
            }
            throw new Bibliotecaexception(Bibliotecaexception.CODIGO_INEXISTENTE);
        } catch (Bibliotecaexception b) {
            throw b;
        }
    }

    public void serializacion() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Publicaciones.dat"));

            Iterator<Publicaciones> itr = this.Gestion.iterator();
            while (itr.hasNext()) {
                Publicaciones p = itr.next();
                String tipo = p.getClass().getName();
                bw.write(tipo);
                bw.write("#");
                bw.write(p.getCodigo());
                bw.write("#");
                bw.write(p.getISBN());
                bw.write("#");
                bw.write(p.getTitulo());
                bw.write("#");
                bw.write(p.getAutores());
                bw.write("#");
                Calendar c = p.getFechapublicacion();
                bw.write("" + c.get(Calendar.DAY_OF_MONTH));
                bw.write("#");
                bw.write("" + c.get(Calendar.MONTH));
                bw.write("#");
                bw.write("" + c.get(Calendar.YEAR));
                bw.write("#");
                bw.write(p.getFotografia());
                bw.write("#");
                bw.write(""+p.getPaginas());
                bw.write("#");
                bw.write(p.getColeccion());
                bw.write("#"); 
                bw.write(p.getMateria());
                bw.write("#"); 
                bw.write(p.getObservaciones());
                bw.write("#");
               
               
                if (tipo.equals("Biblioteca.Libros")) {
                    Libros l = (Libros) p; 
                    bw.write(l.getEditorial());
                    bw.write("#");
                    bw.write(l.getLocalidad());
                    bw.write("#");
                    bw.write(l.getContenido());
                    bw.write("#");
                    bw.write(""+l.getEdicion());
                    bw.write("#");
                    bw.write(l.getLocalizacion());
                    bw.write("\r\n");
                    
                } else if (tipo.equals("Biblioteca.Revistas")) {
                    Revistas r = (Revistas) p;
                    bw.write(r.getPeriodicidad());
                    bw.write("#");
                    bw.write(""+r.getVolumen());
                    bw.write("#");
                    bw.write(""+r.getNumeropublicacion());
                    bw.write("#");
                    Calendar a = r.getAñodisponible();
                    bw.write("" + a.get(Calendar.YEAR));
                    bw.write("#");
                    bw.write(r.getLocalizacion());
                    bw.write("#");               
                    bw.write("\r\n");
                    
                } else if (tipo.equals("Biblioteca.Proyectos")) {
                    Proyectos pr = (Proyectos) p;
                    bw.write(pr.getTitulacion());
                    bw.write("#");
                    bw.write(pr.getTribunal());
                    bw.write("#");
                    bw.write(pr.getEntidad());
                    bw.write("#");
                    bw.write(pr.getDepartamento());
                    bw.write("#");
                    bw.write("" + pr.getCalificacion());
                    bw.write("#");
                    Calendar f = pr.getFechaLectura();
                    bw.write("" + f.get(Calendar.DAY_OF_MONTH));
                    bw.write("#");
                    bw.write("" + f.get(Calendar.MONTH));
                    bw.write("#");
                    bw.write("" + f.get(Calendar.YEAR));
                    bw.write("#");
                    bw.write("\r\n");
                } else {
                    Tesis t = (Tesis) p;
                    bw.write(t.getPrograma());
                    bw.write("#");
                    bw.write(t.getTribunal());
                    bw.write("#");
                    bw.write(t.getEntidad());
                    bw.write("#");
                    bw.write(t.getDepartamento());
                    bw.write("#");            
                    bw.write("" + t.getCalificacion());
                    bw.write("#");
                    Calendar f = t.getFechaLectura();
                    bw.write("" + f.get(Calendar.DAY_OF_MONTH));
                    bw.write("#");
                    bw.write("" + f.get(Calendar.MONTH));
                    bw.write("#");
                    bw.write("" + f.get(Calendar.YEAR));
                    bw.write("#");
                    bw.write("\r\n");

                }
            }
            bw.close();

        } catch (Exception e) {

            System.out.println(e.toString());

        }
    }

    public void recuperacion() {
        try {

            String cad;
            FileInputStream fis = new FileInputStream("Publicaciones.dat");
            InputStreamReader is = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(is);

            while ((cad = br.readLine()) != null) {

                StringTokenizer tokens = new StringTokenizer(cad, "#");
                int i = 0;
                int num = tokens.countTokens();
                if ((num == 18) || (num == 21)) {
                    String tipo_pub = tokens.nextToken();
                    String codigo = tokens.nextToken();
                    String ISBN = tokens.nextToken();
                    String Titulo = tokens.nextToken();
                    String Autores = tokens.nextToken();
                    int dia = Integer.parseInt(tokens.nextToken());
                    int mes = Integer.parseInt(tokens.nextToken());
                    int año = Integer.parseInt(tokens.nextToken());
                    GregorianCalendar fecha = new GregorianCalendar(año, mes, dia, 0, 0, 0);
                    String Foto = tokens.nextToken();
                    int Paginas = Integer.parseInt(tokens.nextToken());
                    String Coleccion = tokens.nextToken();
                    String Materia = tokens.nextToken();
                    String Observaciones = tokens.nextToken();
                    if (tipo_pub.equals("Biblioteca.Libros")) {
                        String editorial = tokens.nextToken();
                        String localidad = tokens.nextToken();
                        String contenido = tokens.nextToken();
                        int edicion = Integer.parseInt(tokens.nextToken());
                        String localizacion = tokens.nextToken();                                                            
                        Libros l = new Libros(editorial, localidad, contenido, edicion, localizacion, codigo, ISBN, Titulo, Autores, fecha, Foto, Paginas, Coleccion, Materia, Observaciones);
                        this.Altapublicaciones(l);
                    }
                    else if (tipo_pub.equals("Biblioteca.Revistas")) {
                        String periodicidad = tokens.nextToken();
                        int Volumen = Integer.parseInt (tokens.nextToken());
                        int num_pub = Integer.parseInt (tokens.nextToken());
                        año= Integer.parseInt (tokens.nextToken());
                        GregorianCalendar gr=new GregorianCalendar(año, 0, 0, 0, 0, 0);
                        String localizacion=tokens.nextToken();
                        Revistas r = new Revistas(periodicidad, Volumen, num_pub, gr, localizacion, codigo, ISBN, Titulo, Autores, fecha, Foto, Paginas, Coleccion, Materia, Observaciones);
                        this.Altapublicaciones(r);                  
                    }else if (tipo_pub.equals("Biblioteca.Proyectos")){
                        String Titulación = tokens.nextToken();
                        String Tribunal=tokens.nextToken();
                        String Entidad=tokens.nextToken();
                        String Departamento=tokens.nextToken();
                        double Calificación=Double.parseDouble(tokens.nextToken());
                        dia=Integer.parseInt(tokens.nextToken());
                        mes=Integer.parseInt(tokens.nextToken());
                        año=Integer.parseInt(tokens.nextToken());
                        GregorianCalendar gr = new GregorianCalendar(año, mes--, dia, 0, 0, 0);                   
                        Proyectos p = new Proyectos (Titulación, Tribunal, Entidad, Departamento, Calificación, gr, codigo, ISBN, Titulo, Autores, fecha, Foto, Paginas, Coleccion, Materia, Observaciones);
                        this.Altapublicaciones(p);
                        
                    }else if (tipo_pub.equals("Biblioteca.Tesis")){
                        String Programa = tokens.nextToken(); 
                        String Tribunal=tokens.nextToken();
                        String Entidad=tokens.nextToken();
                        String Departamento=tokens.nextToken();
                        double Calificación=Double.parseDouble(tokens.nextToken());  
                        dia=Integer.parseInt(tokens.nextToken());
                        mes=Integer.parseInt(tokens.nextToken());
                        año=Integer.parseInt(tokens.nextToken());
                        GregorianCalendar gr = new GregorianCalendar(año, mes--, dia, 0, 0, 0);               
                        Tesis t = new Tesis (Programa, Tribunal, Entidad, Departamento, Calificación, gr, codigo, ISBN, Titulo, Autores, fecha, Foto, Paginas, Coleccion, Materia, Observaciones);
                        this.Altapublicaciones(t);
                        
                        
                    }

               
              


                }
            }

            //Cerramos el stream
            br.close();

        } catch (Exception e) {
            System.out.println(e.toString());

        }
    }
    
    public String getTipoPublicacion(String cod_pub) throws Bibliotecaexception{
         Iterator it = this.Gestion.iterator();
        try {
            while (it.hasNext()) {
                Publicaciones pb = (Publicaciones) it.next();
                if (pb.getCodigo().equals(cod_pub)) {
                  return pb.getClass().getName();


                }

            }
            throw new Bibliotecaexception(Bibliotecaexception.CODIGO_INEXISTENTE);
        } catch (Bibliotecaexception b) {
            throw b;
        }
        
        
    }
}
