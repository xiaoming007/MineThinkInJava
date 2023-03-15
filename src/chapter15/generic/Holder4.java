package chapter15.generic;

import chapter14.pets.Dog;
import chapter14.pets.Pet;

public class Holder4<Individual>{
    private Individual individual;

    public Holder4(Individual individual) {
        this.individual = individual;
    }
    public void set(Individual individual){
        this.individual = individual;
    }
    public Individual get() {
        return individual;
    }

    public static void main(String[] args) {
        Holder4<Dog>  holder4 = new Holder4<>(new Dog());
        Dog dog = holder4.get();
    }

}
