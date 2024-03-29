package chapter15.generic;

import util.Generator;

public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;
    public BasicGenerator(Class<T> type) {
        this.type = type;
    }
    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<>(type);
    }
}
