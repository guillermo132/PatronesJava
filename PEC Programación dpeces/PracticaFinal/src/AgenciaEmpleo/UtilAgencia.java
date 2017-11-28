package AgenciaEmpleo;


import Clases.Candidato;
import Clases.Oferta;
import Clases.Oficina;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class UtilAgencia {
    
    public static ArrayList ocupacionCNO = new ArrayList();
    public static ArrayList<Oferta> ofertas = new ArrayList<>();
    public static ArrayList<Candidato> candidatos =  new ArrayList<>();
    public static ArrayList<Oficina> oficinas = new ArrayList<>();
    public static ArrayList cbCNO = new ArrayList();
    public static ArrayList<Oferta> ofertasBusqueda = new ArrayList<>();
    public static ArrayList<Candidato> candidatosBusqueda = new ArrayList();
    public static ArrayList<Candidato> candidatosMejorBusqueda = new ArrayList();
    public static ArrayList<Oferta> ofertasMejorBusqueda = new ArrayList();

    //Métodos de la clase get y set

    public static ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    public static void setCandidatos(ArrayList<Candidato> candidatos) {
        UtilAgencia.candidatos = candidatos;
    }
    
    public static ArrayList<Oferta> getOfertas() {
        return ofertas;
    }

    public static void setOfertas(ArrayList<Oferta> ofertas) {
        UtilAgencia.ofertas = ofertas;
    }
    
    public static ArrayList getOcupacionCNO() {
        return ocupacionCNO;
    }

    public static void setOcupacionCNO(ArrayList ocupacionCNO) {
        UtilAgencia.ocupacionCNO = ocupacionCNO;
    }

    public static ArrayList<Oficina> getOficinas() {
        return oficinas;
    }

    public static void setOficinas(ArrayList<Oficina> oficinas) {
        UtilAgencia.oficinas = oficinas;
    }
    
    public static String getListaCBCNO()
    {
        String cno="";
        for (int i = 0; i < cbCNO.size(); i++) {
            cno+=cbCNO.get(i).toString()+",";  
        }
        return cno;
    }
    
    public static void borrarListaCBCNO()
    {
        cbCNO = new ArrayList();
    }
    
    //Obtenemos Ocupaciones CNO-11
    /**
     Obtenemos la lista de todas las ocupaciones de la CNO-11
     */
    public static void getListaOcupacionCNO(){
        String cad, l, l2,separadorN="-----", separadorL="*****";
        boolean valido;
        try {       
            BufferedReader br = new BufferedReader(new FileReader("src/recursos/cno11.txt"));
            while ((cad = br.readLine()) != null) {
                valido = true;
                l = cad.substring(0,1);
                l2 = cad.substring(1,2);
                l2 = l2.trim();
                
                //Comprueba las letras
                for(int i = 0; i < 17 ; i++)
                {
                   if( (char) ('A' + i) == l.charAt(0) ){ 
                       ocupacionCNO.add(separadorL);
                       ocupacionCNO.add(cad);
                       ocupacionCNO.add(separadorL);
                       valido = false; 
                       break;
                   }
                       
                }
                if(valido){
                    //Comprueba si es un numero, y solo un numero
                    for (int i = 0; i < 9; i++) {
                        if(i == Integer.parseInt(l) && l2.equals("")){
                            ocupacionCNO.add(separadorN);
                            ocupacionCNO.add(cad);
                            ocupacionCNO.add(separadorN);
                            valido = false;
                            break;
                        }    
                    }
                }
                if(valido){ //Si todo ha ido bien, agregamos
                ocupacionCNO.add(cad);
                }
            }
            //Cerramos el stream
            br.close();
            System.out.println("Archivo Leido. (Ocupación CNO)");
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
    
    public static Oficina getOficina(String nombreOficina){
        for (int i = 0; i < oficinas.size(); i++) {
            if(oficinas.get(i).getNombre().equals(nombreOficina)){
                return oficinas.get(i);
            }
        }
        return null;
        
    }
    
    public static ArrayList getNombresCNO(String cno){
        ArrayList al = new ArrayList();
        String[] c = cno.split(",");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < ocupacionCNO.size(); j++) {
                String cno1 = ocupacionCNO.get(j).toString().substring(0,4);
                if(c[i].equals(cno1)){
                    al.add(ocupacionCNO.get(j).toString());
                }
            }  
        }
        return al;
    }
    
    public static boolean comprobarListaCNO(String cno){
        String l,l2;
        String num = cno.substring(0,4);
        if(cbCNO.contains(num))
        {
            return false;
        }
        if(cno.subSequence(0, 1).equals("-") || cno.subSequence(0, 1).equals("*") )
        {  
            return false;
        }else
        {
            l = cno.substring(0,1);
            l2 = cno.substring(1,2);
            l2 = l2.trim();

            //Comprueba las letras
            for(int i = 0; i < 17 ; i++)
            {
               if( (char) ('A' + i) == l.charAt(0) ){ 
                   return false;
                   
               }

            }
            //Comprueba si es un numero, y solo un numero
            for (int i = 0; i < 9; i++) {
                if(i == Integer.parseInt(l) && l2.equals("")){
                   return false;
                }    
            }
        }
        cbCNO.add(num);
        return true;
    }
    
    public static boolean comprobarListaCNOOferta(String cno){
        String l,l2;
        String num = cno.substring(0,4);
        if(cno.subSequence(0, 1).equals("-") || cno.subSequence(0, 1).equals("*") )
        {  
            return false;
        }else
        {
            l = cno.substring(0,1);
            l2 = cno.substring(1,2);
            l2 = l2.trim();

            //Comprueba las letras
            for(int i = 0; i < 17 ; i++)
            {
               if( (char) ('A' + i) == l.charAt(0) ){ 
                   return false;
                   
               }

            }
            //Comprueba si es un numero, y solo un numero
            for (int i = 0; i < 9; i++) {
                if(i == Integer.parseInt(l) && l2.equals("")){
                   return false;
                }    
            }
        }
        return true;
    }

    public static void nuevaOferta(Oferta oferta){
        
        ofertas.add(oferta);
    }

    public static void nuevaOficina(Oficina oficina){
        oficinas.add(oficina);
    }

    public static void nuevoCandidato(Candidato candidato){
        candidatos.add(candidato);
    }
    
    public static JTable mostrarCandidatos(JTable tabla){
        
            String[] columnas = {"DNI", "NOMBRE", "TELÉFONO", "VIA", "NÚMERO", "PISO Y LETRA", "LOCALIDAD", "COD POSTAL", "OCUPACIONES", "PALABRAS CLAVE", "RANGO SALARIAL", "DISCAPACIDAD"};
            DefaultTableModel dtm = new DefaultTableModel(null, columnas);
            
            
            
            ArrayList<Candidato> personas = candidatos;
            Object candidatosA[] = personas.toArray();
            
            Object cand[][] = new Object[candidatosA.length][columnas.length];

            for (int i = 0; i < candidatosA.length; i++) {
                Candidato obj = (Candidato) candidatosA[i];
                
                cand[i][0] = obj.getNif();
                cand[i][1] = obj.getNombre();
                cand[i][2] = obj.getTelefono();
                cand[i][3] = obj.getDireccion().getVia();
                cand[i][4] = obj.getDireccion().getNumero();
                cand[i][5] = obj.getDireccion().getPisoLetra();
                cand[i][6] = obj.getDireccion().getLocalidad();
                cand[i][7] = obj.getDireccion().getCodPostal();
                cand[i][8] = obj.getOcupaciones().toString();
                cand[i][9] = obj.getPalabrasClave();
                cand[i][10] = obj.getRangoSalarial();  
                cand[i][11] = obj.getDiscapacidad();
                dtm.addRow(cand);
            }
            dtm.setDataVector(cand, columnas);
            tabla.setModel(dtm);
            return tabla;
        
    }

    public static JTable mostrarOfertas(JTable tabla){
        
            String[] columnas = {"NOMBRE", "OFICINA", "OCUPACIÓN CNO", "PALABRAS CLAVE", "FECHA APERTURA", "FECHA CADUCIDAD", "RANGO SALARIAL", "TIEMPO", "DEDICACION"};
            DefaultTableModel dtm = new DefaultTableModel(null, columnas);
            
            ArrayList<Oferta> ofer = ofertas;
            Object ofertasA[] = ofer.toArray();
            
            Object of[][] = new Object[ofertasA.length][columnas.length];

            for (int i = 0; i < ofertasA.length; i++) {
                Oferta obj = (Oferta) ofertasA[i];
                
                //Traducir la fecha GregorianCalendar
                Date fa = obj.getFechaApertura().getTime();
                Date fc = obj.getFechaCaducidad().getTime();
                String fechaA = DateFormat.getDateInstance(DateFormat.SHORT).format(fa);
                String fechaC = DateFormat.getDateInstance(DateFormat.SHORT).format(fc);
                
                
                of[i][0] = obj.getNombreEmpresa();
                of[i][1] = obj.getOficinaEmpresa().getNombre();
                of[i][2] = obj.getOcupacionCNO();
                of[i][3] = obj.getPalabrasClave();
                of[i][4] = fechaA;
                of[i][5] = fechaC;
                of[i][6] = obj.getRangoSalarial();
                of[i][7] = obj.getTiempo();
                if(obj.getTiempo().equals("Parcial")){
                    of[i][8] = obj.getPorcentageDedicacion();
                }else{
                    of[i][8] = "-";
                }

                dtm.addRow(of);
            }
            dtm.setDataVector(of, columnas);
            tabla.setModel(dtm);
            return tabla;
    }

    public static ImageIcon mostrarFotoCandidato(String nif){
        
        for (int i = 0; i < candidatos.size(); i++) {
            if(candidatos.get(i).getNif().equals(nif)){
                ImageIcon imagen = new ImageIcon(candidatos.get(i).getFoto());
                if(candidatos.get(i).getFoto().indexOf("png") == -1){
                    imagen = new ImageIcon("img/no.png");
                }
                ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(100, 130, 1));
                return imgRedimensionada;
            } 
        }
        return null;
        
    }

    public static ImageIcon mostrarFotoEmpresa(String nombreE){
        
        for (int i = 0; i < ofertas.size(); i++) {
            if(ofertas.get(i).getNombreEmpresa().equals(nombreE)){
                ImageIcon imagen = new ImageIcon(ofertas.get(i).getFoto());
                if(ofertas.get(i).getFoto().indexOf("png") == -1){
                    imagen = new ImageIcon("img/no.png");
                }
                ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(100, 130, 1));
                return imgRedimensionada;
            } 
        }
        return null;
        
    }
    
    public static JTable mostrarOfertasBuscadas(JTable tabla, String palabras, String tipo){
        ofertasBusqueda.clear();
        String[] columnas = {"NOMBRE", "OFICINA", "OCUPACIÓN CNO", "PALABRAS CLAVE", "FECHA APERTURA", "FECHA CADUCIDAD", "RANGO SALARIAL", "TIEMPO", "DEDICACION"};
            DefaultTableModel dtm = new DefaultTableModel(null, columnas);
            
            if(tipo.equals("Ocupacion")){
                palabras = palabras.substring(0, 4);
                for (int i = 0; i < ofertas.size(); i++) {
                        if(ofertas.get(i).getOcupacionCNO().substring(0, 4).equals(palabras))
                        {
                            ofertasBusqueda.add(ofertas.get(i));
                        }         
                }
            }
            else
            {
                String [] palabra = palabras.split(",");
                for (int i = 0; i < ofertas.size(); i++) { //i

                    for (int j = 0; j < palabra.length; j++) { //j
                        String [] palabraC = ofertas.get(i).getPalabrasClave().split(",");
                        String aux = palabra[j];

                        for (int k = 0; k < palabraC.length; k++) {//k

                            if(aux.equals(palabraC[k])){
                                ofertasBusqueda.add(ofertas.get(i));
                                k=palabraC.length;
                                j=palabra.length;
                                //Salgo de los bucles, para pasar al siguiente candidato
                            }

                        }

                    }

                }

            }
            
            ArrayList<Oferta> ofer = ofertasBusqueda;
            Object ofertasA[] = ofer.toArray();
            
            Object of[][] = new Object[ofertasA.length][columnas.length];

            for (int i = 0; i < ofertasA.length; i++) {
                Oferta obj = (Oferta) ofertasA[i];
                
                //Traducir la fecha GregorianCalendar
                Date fa = obj.getFechaApertura().getTime();
                Date fc = obj.getFechaCaducidad().getTime();
                String fechaA = DateFormat.getDateInstance(DateFormat.SHORT).format(fa);
                String fechaC = DateFormat.getDateInstance(DateFormat.SHORT).format(fc);
                
                
                of[i][0] = obj.getNombreEmpresa();
                of[i][1] = obj.getOficinaEmpresa().getNombre();
                of[i][2] = obj.getOcupacionCNO();
                of[i][3] = obj.getPalabrasClave();
                of[i][4] = fechaA;
                of[i][5] = fechaC;
                of[i][6] = obj.getRangoSalarial();
                of[i][7] = obj.getTiempo();
                if(obj.getTiempo().equals("Parcial")){
                    of[i][8] = obj.getPorcentageDedicacion();
                }else{
                    of[i][8] = "-";
                }

                dtm.addRow(of);
            }
            dtm.setDataVector(of, columnas);
            tabla.setModel(dtm);
            return tabla;
    }
    

    public static JTable mostrarCandidatosBuscados(JTable tabla, String palabras, String tipo){
        candidatosBusqueda.clear();
        String[] columnas = {"DNI", "NOMBRE", "TELÉFONO", "VIA", "NÚMERO", "PISO Y LETRA", "LOCALIDAD", "COD POSTAL", "OCUPACIONES", "PALABRAS CLAVE", "RANGO SALARIAL", "DISCAPACIDAD"};
        DefaultTableModel dtm = new DefaultTableModel(null, columnas);

        //Busqueda por Ocupacion
        if(tipo.equals("Ocupacion")){
            palabras = palabras.substring(0, 4);
            for (int i = 0; i < candidatos.size(); i++) { //i
                String [] ocu = candidatos.get(i).getOcupaciones().split(",");
                for (int j = 0; j < ocu.length; j++) { //j
                    if(ocu[j].equals(palabras))
                    {
                        candidatosBusqueda.add(candidatos.get(i));
                    }  
                    
                }
       
            }
        }
        //Busqueda por Palabras Clave
        else
        {
            String [] palabra = palabras.split(",");
            for (int i = 0; i < candidatos.size(); i++) { //i
                
                for (int j = 0; j < palabra.length; j++) { //j
                    String [] palabraC = candidatos.get(i).getPalabrasClave().split(",");
                    String aux = palabra[j];
                    
                    for (int k = 0; k < palabraC.length; k++) {//k
                        
                        if(aux.equals(palabraC[k])){
                            candidatosBusqueda.add(candidatos.get(i));
                            k=palabraC.length;
                            j=palabra.length;
                            //Salgo de los bucles, para pasar al siguiente candidato
                        }
                        
                    }
                    
                }
                
            }
        
        }
        
        

        ArrayList<Candidato> personas = candidatosBusqueda;
        Object candidatosA[] = personas.toArray();

        Object cand[][] = new Object[candidatosA.length][columnas.length];

        for (int i = 0; i < candidatosA.length; i++) {
            Candidato obj = (Candidato) candidatosA[i];

            cand[i][0] = obj.getNif();
            cand[i][1] = obj.getNombre();
            cand[i][2] = obj.getTelefono();
            cand[i][3] = obj.getDireccion().getVia();
            cand[i][4] = obj.getDireccion().getNumero();
            cand[i][5] = obj.getDireccion().getPisoLetra();
            cand[i][6] = obj.getDireccion().getLocalidad();
            cand[i][7] = obj.getDireccion().getCodPostal();
            cand[i][8] = obj.getOcupaciones().toString();
            cand[i][9] = obj.getPalabrasClave();
            cand[i][10] = obj.getRangoSalarial();   
            cand[i][11] = obj.getDiscapacidad();
            dtm.addRow(cand);
        }
        dtm.setDataVector(cand, columnas);
        tabla.setModel(dtm);
        return tabla;
    }
    
    /**
     Mostrar las mejores ofertas para el candidato seleccionado
     * @param tabla
     * @param row
     * @param palabras 
     * @param tipo
     * @return  
     */
    public static JTable mostrarMejoresOfertas(JTable tabla, int row, String palabras, String tipo){
        ofertasMejorBusqueda.clear();
        String[] columnas = {"NOMBRE", "OFICINA", "OCUPACIÓN CNO", "PALABRAS CLAVE", "FECHA APERTURA", "FECHA CADUCIDAD", "RANGO SALARIAL", "TIEMPO", "DEDICACION"};
            DefaultTableModel dtm = new DefaultTableModel(null, columnas);
            
            
            Candidato c = (Candidato) candidatosBusqueda.get(row);
            String [] rangoSC = c.getRangoSalarial().split("-");
            int minC = getSaldoNetondidato(Integer.parseInt(rangoSC[0]), c.getDiscapacidad());
            ArrayList<Oferta> aux = new ArrayList<>();
            
            //Busqueda por Ocupacion
            if(tipo.equals("Ocupacion")){
                ArrayList salario = new ArrayList();
                
                palabras = palabras.substring(0, 4);
                for (int i = 0; i < ofertas.size(); i++) {
                    String [] rangoSO = ofertas.get(i).getRangoSalarial().split("-");
                    int maxO = getSaldoNetoOfertas(Integer.parseInt(rangoSO[1]), ofertas.get(i).getPorcentageDedicacion()); //Maxima Saldo Oferta
                    
                    if(ofertas.get(i).getOcupacionCNO().substring(0, 4).equals(palabras)) //Si coincide la ocupación
                    {
                        if(minC <= maxO){ //Si el minimo del candidato es maspequeño que el máximo de la oferta
                            ofertasMejorBusqueda.add(ofertas.get(i)); //Añado a un arrayList esa oferta
                            salario.add( maxO ); //me guardo el maxO para luego
                        }
                    }   
                }
                //Ordenación de las ofertas
                Collections.sort(salario, Collections.reverseOrder()); //Ordeno el array salario al revés
                for (int i = 0; i < ofertasMejorBusqueda.size(); i++) {
                    aux.add(ofertasMejorBusqueda.get(i)); // Uso aux para luego utilizar ofertasMejorBusqueda
                }
                ofertasMejorBusqueda.clear(); //Le borro para poder utilizarle
                for (int j = 0; j < salario.size(); j++) { //j
                    for (int i = 0; i < aux.size(); i++) { //i
                            String [] rangoSO = aux.get(i).getRangoSalarial().split("-"); //cogo el rando de la 1º oferta guardada
                            int maxO = getSaldoNetoOfertas(Integer.parseInt(rangoSO[1]), aux.get(i).getPorcentageDedicacion()); //Maximo Oferta
                            if(maxO == Integer.parseInt(salario.get(j).toString())) //Si coincide, metemos la oferta, que es la que mas Rango Salarial tiene
                            {
                                ofertasMejorBusqueda.add(aux.get(i));
                                i = aux.size(); //Pasamos al siguiente
                            }
                        }
                    
                }
            }
            //Busqueda por Palabras Clave
            else
            {
                ArrayList contador = new ArrayList();
                Object num = +1;
                String [] palabra = palabras.split(",");
                for (int i = 0; i < ofertas.size(); i++) {//i
                    String [] pOfertas = ofertas.get(i).getPalabrasClave().split(",");
                    
                    for (int j = 0; j < pOfertas.length; j++) {//j
                        
                        for (int k = 0; k < palabra.length; k++) {//k
                            if(palabra[k].equals(pOfertas[j]))
                            {
                                contador.add(0);
                                ofertasMejorBusqueda.add(ofertas.get(i));
                                contador.set(contador.size()-1, num);
                            }
                        }
                        
                    }
                    
                }
                //Ordenación por Clave
                /*
                for (int i = 0; i < ofertasMejorBusqueda.size(); i++) {
                    aux.add(ofertasMejorBusqueda.get(i));
                }
                ofertasMejorBusqueda.clear();
                
                for (int j = 0; j < contador.size(); j++) {
                        for (int i = 10; i>= 0; i--) {
                            if(contador.get(j) == i)
                            {
                                ofertasMejorBusqueda.add(aux.get(j));
                                i=0; //Paso al siguiente Candidato
                            }
                        }       
                }*/
                
            }
            
            
            
            
            ArrayList<Oferta> ofer = ofertasMejorBusqueda;
            Object ofertasA[] = ofer.toArray();
            
            Object of[][] = new Object[ofertasA.length][columnas.length];

            for (int i = 0; i < ofertasA.length; i++) {
                Oferta obj = (Oferta) ofertasA[i];
                
                //Traducir la fecha GregorianCalendar
                Date fa = obj.getFechaApertura().getTime();
                Date fc = obj.getFechaCaducidad().getTime();
                String fechaA = DateFormat.getDateInstance(DateFormat.SHORT).format(fa);
                String fechaC = DateFormat.getDateInstance(DateFormat.SHORT).format(fc);
                
                
                of[i][0] = obj.getNombreEmpresa();
                of[i][1] = obj.getOficinaEmpresa().getNombre();
                of[i][2] = obj.getOcupacionCNO();
                of[i][3] = obj.getPalabrasClave();
                of[i][4] = fechaA;
                of[i][5] = fechaC;
                of[i][6] = obj.getRangoSalarial();
                of[i][7] = obj.getTiempo();
                if(obj.getTiempo().equals("Parcial")){
                    of[i][8] = obj.getPorcentageDedicacion();
                }else{
                    of[i][8] = "-";
                }

                dtm.addRow(of);
            }
            dtm.setDataVector(of, columnas);
            tabla.setModel(dtm);
            return tabla;
    }
    
    /**
     Mostrar los mejores candidatos para la oferta seleccionada
     * @param tabla 
     * @param row
     * @param palabras
     * @param tipo 
     * @return  
     */
    public static JTable mostrarMejoresCandidatos(JTable tabla, int row,String palabras, String tipo){
        candidatosMejorBusqueda.clear();
        String[] columnas = {"DNI", "NOMBRE", "TELÉFONO", "VIA", "NÚMERO", "PISO Y LETRA", "LOCALIDAD", "COD POSTAL", "OCUPACIONES", "PALABRAS CLAVE", "RANGO SALARIAL", "DISCAPACIDAD"};
        DefaultTableModel dtm = new DefaultTableModel(null, columnas);
        ArrayList<Candidato> aux = new ArrayList();
        
        //Busqueda por Ocupacion
            if(tipo.equals("Ocupacion")){
                ArrayList salario = new ArrayList();
                
                palabras = palabras.substring(0, 4);
                Oferta o = (Oferta) ofertasBusqueda.get(row);
                String [] rangoSO = o.getRangoSalarial().split("-");

                int maxO = getSaldoNetoOfertas(Integer.parseInt(rangoSO[1]), o.getPorcentageDedicacion());
                
                for (int i = 0; i < candidatos.size(); i++) { //i
                    String [] rangoSC = candidatos.get(i).getRangoSalarial().split("-");
                    int minC = getSaldoNetondidato(Integer.parseInt(rangoSC[0]), candidatos.get(i).getDiscapacidad()); //Obtengo el saldo real
                    String [] ocu = candidatos.get(i).getOcupaciones().split(","); //Separo las ocupaciones
                    
                    for (int j = 0; j < ocu.length; j++) { //j
                        if(ocu[j].equals(palabras)) //Comparo ocupaciones
                        {
                            if(minC <= maxO){ //Si el minimo del Can es menor que el max de Ofe
                                candidatosMejorBusqueda.add(candidatos.get(i));
                                j=ocu.length; //Paso al siguiente candidato
                                salario.add(minC); //Me guardo el salario min de Can
                            }
                        }   
                        
                    }      
                }
                //Ordenación de los mejores Candidatos
                Collections.sort(salario); //Ordeno salarios
                for (int i = 0; i < candidatosMejorBusqueda.size(); i++) {
                    aux.add(candidatosMejorBusqueda.get(i));
                }
                candidatosMejorBusqueda.clear();
                for (int j = 0; j < salario.size(); j++) { //j
                    for (int i = 0; i < aux.size(); i++) {//i
                        String [] rangoSC = aux.get(i).getRangoSalarial().split("-");
                        int minC = getSaldoNetondidato(Integer.parseInt(rangoSC[0]), aux.get(i).getDiscapacidad()); //Obtengo el saldo real
                   
                        
                        if(minC == Integer.parseInt(salario.get(j).toString()))
                        {
                            candidatosMejorBusqueda.add(aux.get(i));
                        }
                    }
                    
                }
                
                
            }
            //Busqueda por Palabras Clave
            else
            {   
                ArrayList contador = new ArrayList();
                Object num = +1;
                String [] palabra = palabras.split(",");
                for (int i = 0; i < candidatos.size(); i++) {//i
                    String [] pCandi = candidatos.get(i).getPalabrasClave().split(",");
                    
                    for (int j = 0; j < pCandi.length; j++) {//j
                        
                        for (int k = 0; k < palabra.length; k++) {//k
                            if(palabra[k].equals(pCandi[j]))
                            {
                                contador.add(0);
                                candidatosMejorBusqueda.add(candidatos.get(i));
                                contador.set(contador.size()-1, num);
                            }
                        }
                        
                    }
                    
                }
                
                //Ordenación por Clave
                /*for (int i = 0; i < candidatosMejorBusqueda.size(); i++) {
                    aux.add(candidatosMejorBusqueda.get(i));
                }
                candidatosMejorBusqueda.clear();
                
                for (int j = 0; j < contador.size(); j++) {
                        for (int i = 10; i>= 0; i--) {
                            if(contador.get(j) == i)
                            {
                                candidatosMejorBusqueda.add(aux.get(j));
                                i=0; //Paso al siguiente Candidato
                            }
                        }       
                }
                */
          }

        ArrayList<Candidato> personas = candidatosMejorBusqueda;
        Object candidatosA[] = personas.toArray();

        Object cand[][] = new Object[candidatosA.length][columnas.length];

        for (int i = 0; i < candidatosA.length; i++) {
            Candidato obj = (Candidato) candidatosA[i];

            cand[i][0] = obj.getNif();
            cand[i][1] = obj.getNombre();
            cand[i][2] = obj.getTelefono();
            cand[i][3] = obj.getDireccion().getVia();
            cand[i][4] = obj.getDireccion().getNumero();
            cand[i][5] = obj.getDireccion().getPisoLetra();
            cand[i][6] = obj.getDireccion().getLocalidad();
            cand[i][7] = obj.getDireccion().getCodPostal();
            cand[i][8] = obj.getOcupaciones().toString();
            cand[i][9] = obj.getPalabrasClave();
            cand[i][10] = obj.getRangoSalarial();   
            cand[i][11] = obj.getDiscapacidad();
            dtm.addRow(cand);
        }
        dtm.setDataVector(cand, columnas);
        tabla.setModel(dtm);
        return tabla;
    }
    
    
    //Cálculo de Rangos Salariales
    /**
     Saldo neto para las ofertas (Impuestos y mensual)
     * @param saldo 
     * @param dedicacion 
     * @return 
     */
    public static int getSaldoNetoOfertas(int saldo, int dedicacion){
        if(dedicacion < 50){
            if(saldo < 18000){ saldo = (int)(saldo - saldo*0.2); }
            else if(saldo < 30000){ saldo = (int)(saldo - saldo*0.34); }
            else{ saldo = (int)(saldo - saldo*0.47); }
        }
        else
        {
            if(saldo < 18000){ saldo = (int)(saldo - saldo*0.15); }
            else if(saldo < 30000){ saldo = (int)(saldo - saldo*0.3); }
            else{ saldo = (int)(saldo - saldo*0.42); }
        }
        return saldo/12;
    }
    
    /**
     * Saldo de los candidatos (Discapacidad)
     * @param saldo
     * @param discapacidad
     * @return  
     */
    public static int getSaldoNetondidato(int saldo, int discapacidad){
        if(discapacidad > 50) saldo = (int) (saldo - saldo*0.1);
            else if(discapacidad != 0)   saldo = (int) (saldo - saldo*0.05);
        
        return saldo;
    }
    //Borrado de Datos
    
    /**
     Borra la tabla de los mejoresOfertas/Candidatos
     * @param tabla
     * @return  
     */
    public static JTable borrarTablaMejores(JTable tabla){
        candidatosMejorBusqueda.clear();
        ofertasMejorBusqueda.clear();
        DefaultTableModel dtm = new DefaultTableModel();
        tabla.setModel(dtm);
        return tabla;
    }
    
    /**
     Borra la oferta
     * @param index 
     */
    public static void borrarOfertaVisor(int index)
    {
        ofertas.remove(index);
    }
    /**
     Borra un candidato
     * @param index 
     */
    public static void borrarCandidatoVisor(int index)
    {
        candidatos.remove(index);
    }
    /**
     Borra la oferta y el candidato que hemos seleccionado
     * @param oferta 
     * @param busqueda
     * @param candidato  
     */
    public static void borrarAdjudicacion(int oferta, int candidato, String busqueda)
    {
        if(busqueda.equals("Candidatos"))
        {
            Candidato c = candidatosBusqueda.get(candidato);
            Oferta o = ofertasMejorBusqueda.get(oferta);
            candidatos.remove(c);
            ofertas.remove(o);
        }
        else
        {
            Candidato c = candidatosMejorBusqueda.get(candidato);
            Oferta o = ofertasBusqueda.get(oferta);
            candidatos.remove(c);
            ofertas.remove(o);
        }
            
    }
    
    
}

