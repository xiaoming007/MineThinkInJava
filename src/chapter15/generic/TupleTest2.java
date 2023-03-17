package chapter15.generic;

import chapter14.pets.Dog;
import util.ThreeTuple;
import util.TwoTuple;
import static util.Tuple.*;

public class TupleTest2 {
    static TwoTuple<String,Integer> f() {
        return tuple("hi",47);
    }
    static TwoTuple f2() {
        return tuple("hi",47);
    }
    static ThreeTuple<Dog,String,Integer> g() {
        return tuple(new Dog(),"hi",47);
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
    }
}
