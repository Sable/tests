public class test225 {
    static <E extends A> E m(E e) { System.out.print("[A:"+e.getClass()+"]"); return e; }

    public static void main(String[] args) {
        A a = m(new A());
        B b = m(new B());
        C c = m(new C());
    }
}

class A {}
class B extends A {}
class C extends A {}
