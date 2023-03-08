package chapter14.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator{
    private static List<Class<? extends Pet>> types = new ArrayList<>();
    private static String[] names = {
            "chapter14.pets.Mutt",
            "chapter14.pets.Pug",
            "chapter14.pets.EgyptionMau",
            "chapter14.pets.Manx",
            "chapter14.pets.Cymric",
            "chapter14.pets.Rat",
            "chapter14.pets.Mouse",
            "chapter14.pets.Hamster"
    };

    private static void loader(){
        for (String name : names){
            try {
                types.add((Class<? extends Pet>) Class.forName(name));
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static {
        loader();
    }
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
