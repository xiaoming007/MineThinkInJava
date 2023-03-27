package chapter15.generic;

public class Holder<T> {
    private T value;
    public Holder() {

    }
    public Holder(T val) {
        value = val;
    }

    public void set(T val) {
        value = val;
    }
}
