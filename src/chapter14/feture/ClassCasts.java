package chapter14.feture;

class Building{}

class Hourse extends Building{}
public class ClassCasts {

    public static void main(String[] args) {
        Building building = new Hourse();
        Class<Hourse> hourseClass = Hourse.class;
        // 与下面代码等价 hourse = (Hourse) building;
        Hourse hourse = hourseClass.cast(building);
    }
}
