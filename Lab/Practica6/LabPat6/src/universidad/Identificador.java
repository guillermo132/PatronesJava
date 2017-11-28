package universidad;

public class Identificador implements Handler {

    private int _id;

    public Identificador(int id) {
        _id = id;
    }

    public Identificador(String id) throws NumberFormatException {
        _id = new Integer(id).intValue();
    }

    public Identificador(Handler otro) throws NumberFormatException {
        _id = new Integer(otro.toString()).intValue();
    }

    @Override
    public String toString() {
        return new Integer(_id).toString();
    }

    @Override
    public int compareTo(Handler otro) {
        return toString().compareTo(otro.toString());
    }
}
