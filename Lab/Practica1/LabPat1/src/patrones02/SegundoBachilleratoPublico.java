package patrones02;

public class SegundoBachilleratoPublico extends Titulacion {

    public SegundoBachilleratoPublico(String nombre) {
        super(nombre);
    }
    
    @Override
    public void calculaMatricula() {
        System.out.println(super.getNombre() + "\tPrecio matrícula: " + 0);
    }
}
