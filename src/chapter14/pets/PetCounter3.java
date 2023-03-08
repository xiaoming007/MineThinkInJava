package chapter14.pets;

import java.util.Collections;
import java.util.LinkedHashMap;

public class PetCounter3 {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>,Integer>{
       public PetCounter() {
           super();
       }
    }
}
