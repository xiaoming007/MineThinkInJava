package chapter15.generic;

abstract class GenericWithCreate<T> {
    final T element;
    GenericWithCreate() {
        element = create();
    }
    abstract T create();
}
class X {}
class Creator extends GenericWithCreate<X> {

    @Override
    X create() {
        return new X();
    }
    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}
public class CreatorGeneraic {
    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.f();

    }
}
