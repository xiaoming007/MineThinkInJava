package chapter15.generic;

import chapter14.pets.Person;
import chapter14.pets.Pet;
import util.New;

import java.util.List;
import java.util.Map;

public class LimitsOfInference {
    static void f(Map<Person, List<? extends Pet>> petPeople) {

    }

    public static void main(String[] args) {
        f(New.map());
    }
}
