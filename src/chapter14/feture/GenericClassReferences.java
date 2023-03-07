package chapter14.feture;

public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = Integer.class;
        Class<Integer> integerClass = int.class;
        integerClass = Integer.class;
        // Class<Number> numberClass = Integer.class; Integer的Class 并不是Number的Class的子类
    }
}
