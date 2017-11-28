package universidad;

public class NominaPDI extends Nomina {
    
    private double complementoInvestigacion;

    public NominaPDI(double sueldo, double irpf, double complementoInvestigacion) {
        super(sueldo, irpf);
        this.complementoInvestigacion = complementoInvestigacion;
    }
    
    @Override
    public double sueldoNeto() {
        double total = super.getSueldo() + this.complementoInvestigacion;
        return total - (total*(super.getIrpf()/100));
    }

    @Override
    public String toString() {
        return "NominaPDI:" + "\nSueldo: " + super.getSueldo()                  
                + "\nComplemento Investigacion: " + this.complementoInvestigacion  
                + "\n IRPF: " + super.getIrpf()
                + "\n Sueldo Neto: " + sueldoNeto();
    }
    
}
