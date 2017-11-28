package universidad;

public class NIF implements Handler {

    private String _id;

    public NIF(String id) throws BadFormatException {
        boolean ok;
        int i;

        ok = true;
        i = 0;
        if (id.length() == 9) {
            while (ok && (i < id.length() - 1)) {
                if (Character.isDigit(id.charAt(i))) {
                    i++;
                } else {
                    ok = false;
                }
            }
            if (!Character.isLetter(id.charAt(i))) {
                ok = false;
            }
        } else {
            ok = false;
        }
        if (ok) {
            _id = id;
        } else {
            throw new BadFormatException();
        }
    }

    public NIF(Handler otro) throws BadFormatException {
        String id;
        boolean ok;
        int i;

        id = otro.toString();
        ok = true;
        i = 0;
        if (id.length() == 9) {
            while (ok && (i < id.length() - 1)) {
                if (Character.isDigit(id.charAt(i))) {
                    i++;
                } else {
                    ok = false;
                }
            }
            if (!Character.isLetter(id.charAt(i))) {
                ok = false;
            }
        } else {
            ok = false;
        }
        if (ok) {
            _id = id;
        } else {
            throw new BadFormatException();
        }
    }

    @Override
    public String toString() {
        return _id;
    }

    @Override
    public int compareTo(Handler otro) {
        return _id.compareTo(otro.toString());
    }
}
