package chapter14.initable;

public class Initable1 {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(100);

    static {
        System.out.println("Initable1 init");
    }
}
