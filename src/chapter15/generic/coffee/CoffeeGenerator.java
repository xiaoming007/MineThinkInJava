package chapter15.generic.coffee;

import util.Generator;

import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {

    private Class[] types = {
            Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class
    };
    private static Random random = new Random(47);

    public CoffeeGenerator(){}
    private int size = 0;
    public CoffeeGenerator(int size) {
        this.size = size;
    }
    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    @Override
    public void forEach(Consumer<? super Coffee> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Coffee> spliterator() {
        return Iterable.super.spliterator();
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    class CoffeeIterator implements Iterator<Coffee> {

        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }

        @Override
        public void forEachRemaining(Consumer<? super Coffee> action) {
            Iterator.super.forEachRemaining(action);
        }
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
        for (Coffee c : new CoffeeGenerator(5)) {
            System.out.println(c);
        }


    }
}
