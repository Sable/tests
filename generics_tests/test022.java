public class test022 <T> {
    public T t;
    test022(T t) {
        this.t = t;
    }
    public static void main(String[] args) {
        new test022<String>("OUTER").bar();
    }
    void bar() {
        new test022<test022>(this) {
            void run() {
                new Object() {
                    void run() {
                        test022 x = t;
				        System.out.println("SUCCESS");
                    }
                }.run();
            }
        }.run();
    }
}
