public class test025 <T> extends A<T> {
    protected T t;
    test025(T t) {
        this.t = t;
    }
    public static void main(String[] args) {
        new test025<String>("OUTER").bar();
    }
    void bar() {
        new test025<test025>(this) {
            void run() {
                new Object() {
                    void run() {
                        print(t);
                    }
                }.run();
            }
        }.run();
    }
}

class A<P>{
    protected void print(P p){
        System.out.println("SUCCESS");
    }
}
