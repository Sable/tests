public class test010 <T extends Exception> {
    T foo(T t) throws T {
        return t;
    }
    public static void main(String[] args) {
        new test010<Etest010>().baz(new Etest010());
    }
    void baz(final T t) {
        new Object() {
            void print() {
                System.out.println(foo(t));
            }
        }.print();
    }
}
class Etest010 extends Exception {
}
