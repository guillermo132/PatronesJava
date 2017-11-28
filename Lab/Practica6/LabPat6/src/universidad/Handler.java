package universidad;

public interface Handler {

    @Override
    public String toString();

    public int compareTo(Handler otro);
}
