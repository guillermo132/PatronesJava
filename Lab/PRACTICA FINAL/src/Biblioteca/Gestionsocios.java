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
public class Gestionsocios {

    public Gestionsocios() {
        this.Gestion = new HashMap ();
    }

    private HashMap Gestion;

    public HashMap getGestion() {
        return Gestion;
    }

    public void setGestion(HashMap Gestion) {
        this.Gestion = Gestion;
    }
public void Altasocio (Socios s) throws Bibliotecaexception{

    try{
    Socios so = (Socios) this.Gestion.get(s.getCodigosocio());
    if (so!=null)
        throw new Bibliotecaexception (Bibliotecaexception.CODIGO_INTRODUCIDO);

    else
        this.Gestion.put(s.getCodigosocio(), s);
    }
   
 
    catch(Bibliotecaexception b){
        throw b;
    }


}
public void Bajasocio (String codigo) throws Bibliotecaexception{

    try{
    Socios so = (Socios) this.Gestion.get(codigo);
    if (so != null){
        this.Gestion.remove(codigo);        

    } 
    else
        throw new Bibliotecaexception (Bibliotecaexception.CODIGO_INEXISTENTE);
    } catch(Bibliotecaexception b){
        throw b;
    }
}
    public void serializacion(){
         try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Socios.dat"));            
      
          
            Iterator<Socios> itr = this.Gestion.entrySet().iterator();
                    //el iterator();
            while(itr.hasNext())
            {
                Map.Entry m=(Map.Entry)itr.next();
                String id=(String)m.getKey();
                Socios s=(Socios)this.Gestion.get(id);
                bw.write(s.getCategoria());
                bw.write("#");
                bw.write(s.getCodigosocio());
                bw.write("#");
                bw.write(s.getDNI());
                bw.write("#");
                bw.write(s.getNombresocio());
                bw.write("#");
                Calendar insc=s.getInscripcion();
                bw.write(""+insc.get(Calendar.DAY_OF_MONTH));
                bw.write("#");
                bw.write(""+insc.get(Calendar.MONTH));
                bw.write("#");
                bw.write(""+insc.get(Calendar.YEAR));
                bw.write("#");           
                bw.write("\r\n");
            }
            bw.close();

        } catch (Exception e) {

            System.out.println(e.toString());

        }
    }
    public void recuperacion(){
        try {

            String cad;
            FileInputStream fis = new FileInputStream("Socios.dat");
            InputStreamReader is = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(is);

            while ((cad = br.readLine()) != null) {

                StringTokenizer tokens = new StringTokenizer(cad, "#");
                int i = 0;
                int num = tokens.countTokens();
                if (num == 7) {
                    String Categoria = tokens.nextToken();
                    String Codigo = tokens.nextToken();
                    String DNI = tokens.nextToken();   
                    String Nombre = tokens.nextToken();                                     
                    int dia = Integer.parseInt(tokens.nextToken());
                    int mes = Integer.parseInt(tokens.nextToken());
                    int año = Integer.parseInt(tokens.nextToken());
                    GregorianCalendar g=new GregorianCalendar(año, mes, dia, 0, 0, 0);
                    Socios s=new Socios(Codigo, Nombre, DNI, Categoria, g);
                    this.Altasocio(s);


                }

            }


            //Cerramos el stream
            br.close();


        } catch (Exception e) {

            System.out.println(e.toString());

        }
    
    }
}
