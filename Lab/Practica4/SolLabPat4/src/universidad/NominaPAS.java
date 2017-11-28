package universidad;

public class NominaPAS extends Nomina {
    
    private double complementoProductividad;

    public NominaPAS(double sueldo, double irpf, double complementoProductividad) {
        super(sueldo, irpf);
        this.complementoProductividad = complementoProductividad;
    }
    
    @Override
    public double sueldoNeto() {
        double total = super.getSueldo() + this.complementoProductividad;
        return total - (total*(super.getIrpf()/100));
    }
    
    @Override
    public String toString() {
        return "NominaPAS:" + "\nSueldo: " + super.getSueldo()                  
                + "\nComplemento Productividad: " + this.complementoProductividad  
                + "\n IRPF: " + super.getIrpf()
                + "\n Sueldo Neto: " + sueldoNeto();
    }
    
}
