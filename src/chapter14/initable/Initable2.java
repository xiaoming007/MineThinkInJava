package chapter14.initable;

public class Initable2 {
    static int staticNoFinal = 147;

    static {
        System.out.println("Initable2 init");
    }
}
