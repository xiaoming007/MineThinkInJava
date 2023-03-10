package chapter14.factory;

public class RegisteredFactories {
    public static void main(String[] args) {
        createByFactory();

        createByNewInstance();

    }

    private static void createByNewInstance() {
        for (int i = 0; i < 10; i++){
            System.out.println(Part.createRandomByNewInstance());
        }
    }

    private static void createByFactory() {
        for (int i = 0; i < 10; i++){
            System.out.println(Part.createRandom());
        }
    }
}
