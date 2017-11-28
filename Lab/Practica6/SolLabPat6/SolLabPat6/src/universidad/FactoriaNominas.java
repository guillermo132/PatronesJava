package universidad;

import java.util.Random;

public class FactoriaNominas {

    public static final int PDI = 0;
    public static final int PAS = 1;

    public Nomina getNomina(int tipo) {
        Random rand = new Random();  
        if (tipo == PDI) {
            return (new NominaPDI(rand.nextDouble()*1000 + 1000, 25, rand.nextDouble()*500));
        } else {
            return (new NominaPAS(rand.nextDouble()*500 + 1000, 15, rand.nextDouble()*300));
        }
    }
}
