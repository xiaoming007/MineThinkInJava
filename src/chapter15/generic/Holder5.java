package chapter15.generic;

import chapter14.pets.Pet;

public class Holder5<T> {
    private T a;
    private T b;
    private T c;
    public Holder5(T a,T b,T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(T a) {
        this.a = a;
    }
    public void setB(T b) {
        this.b = b;
    }
    public void setC(T c) {
        this.c = c;
    }
    public T getA() {
        return a;
    }
    public T getB() {
        return b;
    }
    public T getC() {
        return c;
    }

    public static void main(String[] args) {
        Holder5<Pet> holder5 = new Holder5<>(new Pet(),new Pet(),new Pet());

    }

}
