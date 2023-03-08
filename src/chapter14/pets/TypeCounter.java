package chapter14.pets;

import java.util.HashMap;

public class TypeCounter extends HashMap<Class<?>,Integer> {
    private Class<?> baseType;
    public TypeCounter(Class<?> baseType){
       this.baseType = baseType;
    }
    public void counter(Object obj){
        Class<?> type = obj.getClass();
        if (!baseType.isAssignableFrom(type)){
            throw new RuntimeException(obj + "incorrect type");
        }
        countClass(type);

    }

    private void countClass(Class<?> type) {
        Integer quantity = get(type);
        put(type,quantity == null ? 1 : quantity + 1);
        Class<?> superClass = type.getSuperclass();
        if (superClass != null && baseType.isAssignableFrom(superClass)){
            countClass(superClass);
        }
    }
}
