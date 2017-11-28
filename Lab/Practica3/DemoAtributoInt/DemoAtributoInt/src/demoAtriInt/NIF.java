package demoAtriInt;

public class NIF implements AtriInt {

    private String _id;

    public NIF(String id) {
        _id = id;
    }

    public NIF(int id) {
        _id = Integer.toString(id);
    }

    @Override
    public String toString() {
        return _id;
    }

    @Override
    public int compareTo(AtriInt otro) { //Te dice si es el mismo DNI.
        return _id.compareTo(otro.toString());
    }
}
