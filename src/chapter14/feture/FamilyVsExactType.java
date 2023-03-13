package chapter14.feture;

class Base{}
class Derived extends Base{}
public class FamilyVsExactType {
    static void test(Object x){
        System.out.println("Testing x of type" + x.getClass());
        System.out.println("x instanceof Base" +( x instanceof Base));
        System.out.println("x instanceof Derived" + (x instanceof Derived));
        System.out.println("Base.isInstanceof(x)" + Base.class.isInstance(x));
        System.out.println("Derived.isInstance(x)" + Derived.class.isInstance(x));
        System.out.println("x.getClass() == Base.class" + (x.getClass() == Base.class));
        System.out.println("x.getClass() == Derived.class" + (x.getClass() == Derived.class));
        System.out.println("equals Base" + x.getClass().equals(Base.class));
        System.out.println("equals Derived" + x.getClass().equals(Derived.class));


    }

    public static void main(String[] args) {
        // instanceof 会比较其继承关系parFactories
        test(new Base());
        test(new Derived());
    }
}
