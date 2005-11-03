public class test029 <T> extends p.A<T> {
    protected T t;
    test029(T t) {
        this.t = t;
    }
    public static void main(String[] args) {
        new test029<String>("OUTER").bar();
    }
    void bar() {
        new test029<test029>(this) {
            void run() {
                new Object() {
                    void run() {
                        print(test029.this.t);
                    }
                }.run();
            }
        }.run();
    }
}
