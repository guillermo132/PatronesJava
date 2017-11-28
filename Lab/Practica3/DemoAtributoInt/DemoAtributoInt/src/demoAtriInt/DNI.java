package demoAtriInt;

public class DNI implements AtriInt {

    private int _id;

    public DNI(int id) {
        _id = id;
    }

    public DNI(String id) throws NumberFormatException {
        _id = new Integer(id).intValue();
    }

    @Override
    public String toString() {
        return new Integer(_id).toString();
    }

    @Override
    public int compareTo(AtriInt otro) {
        return toString().compareTo(otro.toString());
    }
}
