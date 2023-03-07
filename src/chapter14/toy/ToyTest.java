package chapter14.toy;

public class ToyTest {
    static void printInfo(Class cc){
       System.out.println("Class Name" + cc.getName() + "is Interface" + cc.isInterface());
       System.out.println("SimpleName" + cc.getSimpleName());
       System.out.println("Canonical Name" + cc.getCanonicalName());

    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("chapter14.toy.FancyToy") ;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        printInfo(c);
        for (Class item:
             c.getInterfaces()) {
            printInfo(item);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        printInfo(obj.getClass());

        PrintExtends.printExtends(new Toy4());
    }
}
