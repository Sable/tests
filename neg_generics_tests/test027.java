public class test027 <T> {
    private T t;
    test027(T t) {
        this.t = t;
    }
    public static void main(String[] args) {
        new test027<String>("OUTER").bar();
    }
    void bar() {
        new test027<test027>(this) {
            void run() {
                new Object() {
                    void run() {
                        test027 x = t;
				        System.out.println(x);
                    }
                }.run();
            }
        }.run();
    }
}
