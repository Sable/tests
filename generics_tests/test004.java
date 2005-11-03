public class test004 <T extends String> {
    T foo(T t) {
        return t;
    }
    public static void main(String[] args) {
        new test004<String>().baz("SUCCESS");
    }
    void baz(final T t) {
        new Object() {
            void print() {
                System.out.println(foo(t));
            }
        }.print();
    }
}
