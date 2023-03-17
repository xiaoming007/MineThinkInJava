package chapter15.generic;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer>{
    private int n;
    public IterableFibonacci(int count) {
        n = count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return IterableFibonacci.this.next();
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }

    public static void main(String[] args) {
        for (int i : new IterableFibonacci(18)) {
            System.out.println(i +" ");
        }
    }
}
