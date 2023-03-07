package chapter14.feture;

import chapter14.toy.FancyToy;

public class GenericToyTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Class<FancyToy> fancyToyClass = FancyToy.class;
        FancyToy fancyToy = fancyToyClass.newInstance();

        Class<? super FancyToy> up = fancyToyClass.getSuperclass();
        // 这里无法识别到具体的父类型，识别到的父类型为
        // Object Class<Toy> up2 = fancyToyClass.getSuperclass();
        Object parent = up.newInstance();


    }
}
