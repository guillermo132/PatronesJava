package universidad.adapter;

import universidad.NominaPAS;
import universidad.NominaPDI;

/**
 * Clase de test para probar el adaptador de nóminas. 
 */
public class AdapterTest {
    public static void main(String args[]){
        NominaAdapter adaptador;
        
        NominaPAS nominaPAS = new NominaPAS(1200.5, 20, 300);
        adaptador = new NominaAdapter(nominaPAS);
        System.out.println("Sueldo: " + adaptador.getSueldo() + "\tIrpf: " + adaptador.getIrpf());

        NominaPDI nominaPDI = new NominaPDI(6000000.7, 20.5, 400);
        adaptador = new NominaAdapter(nominaPDI);
        System.out.println("Sueldo: " + adaptador.getSueldo() + "\tIrpf: " + adaptador.getIrpf());        
    }
}
