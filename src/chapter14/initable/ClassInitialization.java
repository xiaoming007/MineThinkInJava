package chapter14.initable;

import java.util.Random;

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        Class initable1 = Initable1.class;
        System.out.println(Initable1.staticFinal);
        System.out.println(Initable1.staticFinal2);
        System.out.println(Initable2.staticNoFinal);
        Class i3 = Class.forName("chapter14.initable.Initable3");
        System.out.println(Initable3.staticNoFinal);
    }
}
