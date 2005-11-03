import java.io.IOException;

public class test223 {
    static <E extends A> void m(E e) { System.out.println("A:"+e.getClass()); }
    static <F extends B> void m(F f) throws Exception { System.out.println("B:"+f.getClass()); }
    static <G extends C> void m(G g) throws IOException { System.out.println("C:"+g.getClass()); }

    public static void main(String[] args) {
        m(new A());
        m(new B());
        m(new C());
    }
}

class A {}
class B extends A {}
class C extends A {}

