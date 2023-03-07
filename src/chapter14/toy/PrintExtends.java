package chapter14.toy;

public class PrintExtends {
    public static void printExtends(Object tClass){
        Class t = tClass.getClass();
        Class su = t.getSuperclass();
        try {
            if (su == null) return;
            System.out.println(su.getDeclaredFields());
            printExtends(su.newInstance());
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
