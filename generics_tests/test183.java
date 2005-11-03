import java.lang.Comparable;
public class test183 {
    private static final class X<T1, T2> implements Comparable<X<T1, T2>> {
        public int compareTo(X<T1, T2> arg0) { return 0; }
    };
    private static class Y<T1, T2> {};
    private static final class Z<T1, T2> extends Y<T1, T2> implements Comparable<Z<T1, T2>> {
        public int compareTo(Z<T1, T2> arg0) { return 0; }
    };
    public static <T> void doSomething(Comparable<? super T> a, Comparable<? super T> b) {}
    public static <V1, V2> void doSomethingElse(Z<V1, V2> a, Z<V1, V2> b) {
        doSomething(a, b);
    }
    private static final class W { };
    public static void main(String[] args) {
        doSomething(new X<Integer, String>(), new X<Integer, String>());
        doSomething(new Z<Integer, String>(), new Z<Integer, String>());
        doSomethingElse(new Z<Integer, String>(), new Z<Integer, String>());
        doSomethingElse(new Z<W, String>(), new Z<W, String>());
        // The next line won't compile.  It's the generic<generic which seems
        // to be the problem
        doSomethingElse(new Z<X<W, W>, String>(), new Z<X<W, W>, String>());
    }
}