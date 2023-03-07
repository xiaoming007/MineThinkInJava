package chapter14.initable;

public class Initable3 {
    static int staticNoFinal = 14;

    static {
        System.out.println("Initable3 init");
    }
}
