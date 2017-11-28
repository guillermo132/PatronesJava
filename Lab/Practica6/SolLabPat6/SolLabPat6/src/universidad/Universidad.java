package universidad;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Universidad {

    private String _nombre;
    private ArrayList _personal;

    public Universidad(String nombre) {
        _nombre = nombre;
        _personal = new ArrayList();
        Collection c = _personal;
    }

    public String obtenerNombre() {
        return _nombre;
    }

    public boolean contratar(Personal persona) {
        return _personal.add(persona);
    }

    public boolean jubilar(Handler identificador) {
        Personal persona;
        boolean ok;
        
        persona = buscar(identificador);
        if (persona != null) {
            ok = _personal.remove(persona);
        } else {
            ok = false;
        }
        return ok;
    }

    public Personal buscar(Handler identificador) {
        Personal persona;
        Iterator i;
        boolean encontrado;

        encontrado = false;
        persona = null;
        i = _personal.iterator();
        while (!encontrado && i.hasNext()) {
            persona = (Personal) i.next();
            if (persona.obtenerIdentificador().compareTo(identificador) == 0) {
                encontrado = true;
            }
        }
        if (!encontrado) {
            persona = null;
        }

        return persona;
    }

    public boolean modificar(Personal persona) {
        Personal original;
        original = buscar(persona.obtenerIdentificador());
        return original.modificar(persona);
    }

    public void generarNominas() {
        for (Iterator i = _personal.iterator(); i.hasNext();) {
            ((Personal) i.next()).generarNomina();
        }
    }

    @Override
    public String toString() {
        StringBuffer resultado;

        resultado = new StringBuffer();
        for (Iterator i = _personal.iterator(); i.hasNext();) {
            resultado.append((i.next()).toString()).append("\n");
        }

        return resultado.toString();
    }
    
    public Collection<Personal> getPersonal(){
        return _personal;
    }
}
