package universidad;

public abstract class Nomina {

    private double sueldo;    
    private double irpf;

    public Nomina(double sueldo, double irpf) {
        this.sueldo = sueldo;        
        this.irpf = irpf;
    }    
    
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }
    
    public abstract double sueldoNeto();         
}
