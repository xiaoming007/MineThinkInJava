package chapter14.filled;

public class CountedInteger {
    private static long counter;

    private final long id = counter++;

    public String toString(){
        return Long.toString(id);
    }
}
