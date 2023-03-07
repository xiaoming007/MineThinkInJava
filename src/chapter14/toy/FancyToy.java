package chapter14.toy;

public class FancyToy extends Toy implements HasBatteries,Shoots,Waterproof,NewInterface {
    FancyToy(){
        super(1);
    }
}
