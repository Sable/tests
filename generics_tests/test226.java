public class test226 {
    static <E extends A> E m(E e, E... e2) { System.out.print("[A:"+e.getClass()+"]"); return e; }
    static <F extends B> F m(F f, F... f2) { System.out.print("[B:"+f.getClass()+"]"); return f; }
    static <G extends C> G m(G g, G... g2) { System.out.print("[C:"+g.getClass()+"]"); return g; }

    public static void main(String[] args) {
        A a = m(new A(), new A());
        B b = m(new B(), new B());
        C c = m(new C(), new C());
    }
}

class A {}
class B extends A {}
class C extends A {}
