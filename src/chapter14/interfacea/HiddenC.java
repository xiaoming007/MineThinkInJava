package chapter14.interfacea;

class C implements A{


    @Override
    public void f() {
        System.out.println("public C.f()");
    }
    public void g() {
        System.out.println("public C.g()");
    }
    protected void v() {
        System.out.println("protected C.v()");
    }
    private void w(){
        System.out.println("private C.w()");
    }
    void u() {
        System.out.println("packaeg C.u()");
    }

}
public class HiddenC {
    public static A makeA(){
        return new C();
    }
}
