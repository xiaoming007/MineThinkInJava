package chapter15.generic;

public class GenericArray<T> {
    private T[] array;
    public GenericArray(int sz) {
        array = (T[]) new Object[sz];
    }
    public void put(int index,T item) {
        array[index] = item;
    }
    public T get(int index) {return  array[index];}

    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> gai = new GenericArray<>(10);
        // Integer[] io = gai.rep(); 不能转成Integer[] ，只能转成Object[]
        Object[] oa = gai.rep();
    }
}
