package chapter14.feture;

import chapter14.interfacea.A;
import chapter14.interfacea.HiddenC;

import java.lang.reflect.Method;

public class HiddenImplementation {
    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        callHiddenMethod(a,"g");
        callHiddenMethod(a,"u");
        callHiddenMethod(a,"v");
        callHiddenMethod(a,"w");
    }

    static void callHiddenMethod(Object a,String method) throws Exception {
        Method g = a.getClass().getDeclaredMethod(method);
        g.setAccessible(true);
        g.invoke(a);
    }
}
