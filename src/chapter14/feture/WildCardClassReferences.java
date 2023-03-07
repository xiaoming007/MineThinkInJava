package chapter14.feture;

public class WildCardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
        Class<? extends Number> number = int.class;
        number = double.class;
    }
}
