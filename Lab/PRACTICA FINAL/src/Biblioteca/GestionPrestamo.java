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
public class GestionPrestamo {

    private ArrayList<Prestamo> Prestamo;

    public ArrayList<Prestamo> getPrestamo() {
        return Prestamo;
    }

    public void setPrestamo(ArrayList<Prestamo> Prestamo) {
        this.Prestamo = Prestamo;
    }

    public GestionPrestamo() {
        this.Prestamo = new ArrayList();
    }

    public void Realizarprestamo(Prestamo p) throws Bibliotecaexception {
        Iterator it = this.Prestamo.iterator();
        try {
            while (it.hasNext()) {
                Prestamo pr = (Prestamo) it.next();
                if (pr.getCodigoPublicacion().equals(p.getCodigoPublicacion())) {
                    throw new Bibliotecaexception(Bibliotecaexception.PUBL_PRES);
                }

            }
            this.Prestamo.add(p);

        } catch (Bibliotecaexception b) {
            throw b;

        }

    }

    public void Devolverprestamo(String codigo, String tipo) throws Bibliotecaexception {
        Iterator it = this.Prestamo.iterator();
        try {
            while (it.hasNext()) {
                Prestamo pr = (Prestamo) it.next();
                if (pr.getCodigoPublicacion().equals(codigo)) { //al encontrar el codigo lo borramos del arrayList.
                    this.Prestamo.remove(pr);
                    GregorianCalendar g_final = new GregorianCalendar(Locale.ROOT);
                    GregorianCalendar g_inicio = pr.getFechaPrestamo();
                    int dias = g_final.get(Calendar.DAY_OF_YEAR) - g_inicio.get(Calendar.DAY_OF_YEAR);
                    if (dias < 0) {
                        dias += 365;//Le sumamos 365 para que el día no nos salga negativo.
                    }
                    //Creamos TicketDevolucion
                    this.crearTicket("DEVOLUCION", pr.getCodigoUsuario(), pr.getCodigoPublicacion());    
                    
                    String usuario = pr.getCodigoUsuario().substring(5, 6);                    
                    if (usuario.equals("P")) {
                        if (tipo.equals("Biblioteca.Libros") && (dias > 10)) {
                            throw new Bibliotecaexception(Bibliotecaexception.PUBL_LIB);
                        } else if (tipo.equals("Biblioteca.Revistas") && (dias > 6)) {
                            throw new Bibliotecaexception(Bibliotecaexception.PUBL_REV);
                        } else if (tipo.equals("Biblioteca.Proyectos") && (dias > 12)) {
                            throw new Bibliotecaexception(Bibliotecaexception.PUBL_PRO);
                        } else if (tipo.equals("Biblioteca.Tesis") && (dias > 12)) {

                            throw new Bibliotecaexception(Bibliotecaexception.PUBL_TES);

                        }
                    } else {
                        if (tipo.equals("Biblioteca.Libros") && (dias > 6)) {
                            throw new Bibliotecaexception(Bibliotecaexception.PUBL_LIBA);
                        } else if (tipo.equals("Biblioteca.Revistas") && (dias > 6)) {
                            throw new Bibliotecaexception(Bibliotecaexception.PUBL_REVA);
                        } else if (tipo.equals("Biblioteca.Proyectos") && (dias > 12)) {
                            throw new Bibliotecaexception(Bibliotecaexception.PUBL_PROA);
                        } else if (tipo.equals("Biblioteca.Tesis") && (dias > 12)) {
                            throw new Bibliotecaexception(Bibliotecaexception.PUBL_TESA);
                        }
                    }
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
            BufferedWriter bw = new BufferedWriter(new FileWriter("prestamos.dat"));

            Iterator<Prestamo> itr = this.Prestamo.iterator();
            while (itr.hasNext()) {
                Prestamo p = itr.next();
                bw.write(p.getCodigoPublicacion());
                bw.write("#");
                bw.write(p.getCodigoUsuario());
                bw.write("#");
                Calendar c = p.getFechaPrestamo();
                bw.write("" + c.get(Calendar.DAY_OF_MONTH));
                bw.write("#");
                bw.write("" + c.get(Calendar.MONTH));
                bw.write("#");
                bw.write("" + c.get(Calendar.YEAR));
                bw.write("#");
                bw.write("\r\n");
            }
            bw.close();

        } catch (Exception e) {

            System.out.println(e.toString());

        }
    }

    public void recuperacion() {
        try {

            String cad;
            FileInputStream fis = new FileInputStream("prestamos.dat");
            InputStreamReader is = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(is);

            while ((cad = br.readLine()) != null) {

                StringTokenizer tokens = new StringTokenizer(cad, "#");
                int i = 0;
                int num = tokens.countTokens();
                if (num == 5) {
                    String cod_pub = tokens.nextToken();
                    String cod_socio = tokens.nextToken();
                    int dia = Integer.parseInt(tokens.nextToken());
                    int mes = Integer.parseInt(tokens.nextToken());
                    int año = Integer.parseInt(tokens.nextToken());
                    GregorianCalendar g = new GregorianCalendar(año, mes, dia, 0, 0, 0);
                    Prestamo p = new Prestamo(cod_socio, cod_pub, g);
                    this.Realizarprestamo(p);


                }

            }


            //Cerramos el stream
            br.close();


        } catch (Exception e) {

            System.out.println(e.toString());

        }

    }

    public void crearTicket(String tipo, String cod_soc, String cod_pub) {
        try {
            GregorianCalendar g = new GregorianCalendar(Locale.ROOT);
            int dia = g.get(Calendar.DAY_OF_MONTH);
            int mes = g.get(Calendar.MONTH);
            mes++;
            int año = g.get(Calendar.YEAR);
            int hora = g.get(Calendar.HOUR);
            int min = g.get(Calendar.MINUTE);
            int sec = g.get(Calendar.SECOND);
            String nombre = "Tickets/"+cod_soc + "-" + dia + mes + año + "_" + hora + min + sec + ".txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(nombre));
            bw.write(tipo);
            bw.write("\r\n");
            bw.write("CODIGO SOCIO: ");
            bw.write(cod_soc);
            bw.write("\r\n");
            bw.write("CODIGO PUBLICACION: ");
            bw.write(cod_pub);
            bw.write("\r\n");
            bw.write("FECHA: ");
            bw.write(""+dia);
            bw.write("/");
            bw.write(""+mes);
            bw.write("/");
            bw.write(""+año);
            bw.write("-");
            bw.write(""+hora);
            bw.write(":");
            bw.write(""+min);
            bw.write(":");
            bw.write(""+sec);
            bw.write("\r\n");
            bw.close();

        } catch (Exception e) {

            System.out.println(e.toString());

        }



    }
}
