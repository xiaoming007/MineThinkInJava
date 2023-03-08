package chapter14.pets;

import java.util.HashMap;

public class PetCount {
    static class PetCounter extends HashMap<String,Integer> {
        public void count(String type){
            Integer time = get(type);
            if (time == null){
                put(type,1);
            }else {
                put(type,time + 1);
            }
        }
    }
    public static void counterPet(PetCreator petCreator){
        PetCounter counter = new PetCounter();
        for (Pet pet: petCreator.createArray(20)){
            if (pet instanceof Pet) counter.count("Pet");
            if (pet instanceof Dog) counter.count("Dog");
            if (pet instanceof Mutt) counter.count("Mutt");
            if (pet instanceof Pug) counter.count("Pug");
            if (pet instanceof Cat) counter.count("Cat");
            if (pet instanceof Manx) counter.count("Manx");
            if (pet instanceof Cymric) counter.count("Cymric");
            if (pet instanceof Rodent) counter.count("Rodent");
            if (pet instanceof Rat) counter.count("Rat");
            if (pet instanceof Mouse) counter.count("Mouse");
            if (pet instanceof Hamster) counter.count("Hamster");
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
       counterPet(new ForNameCreator());
    }
}
