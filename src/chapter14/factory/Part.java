package chapter14.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Part {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    static List<Factory<? extends Part>> partFactories = new ArrayList<>();
    static List<Part> parts = new ArrayList<>();
    static {
        try {
            parts.add(FuelFilter.class.newInstance());
            parts.add(AirFilter.class.newInstance());
            parts.add(CarbinAirFilter.class.newInstance());
            parts.add(OilFilter.class.newInstance());
            parts.add(FanBelt.class.newInstance());
            parts.add(PowerSteeringBelt.class.newInstance());
            parts.add(GenratorBelt.class.newInstance());

        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CarbinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new GenratorBelt.Factory());
    }
    private static Random rand = new Random(47);
    public static Part createRandom(){
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
    public static Part createRandomByNewInstance(){
        int n = rand.nextInt(parts.size());
        return parts.get(n);
    }
}
