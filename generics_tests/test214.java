interface I<T> {
    void m1(T t);
    void m2(T t);
}

class A {};

class B implements I<A> {
    public void m1(A a) {
    	System.out.println("SUCCESS");
    }
    public void m2(A a) {}
}

public class test214 {
    public static void main(String[] args) {
        m(new B());
    }

    public static void m(I<A> x) {
        x.m1(null);
    }
}
