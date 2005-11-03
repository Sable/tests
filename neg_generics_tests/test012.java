public class test012 <T> {
     private T foo(T t) {
        System.out.println(t);
        return t;
    }
    public static void main(String[] args) {
        new test012<test012Y>() {
            void run() {
                foo(new test012Y());
            }
        }.run();
    }
}
class test012Y {
    public String toString() {
        return "SUCCESS";
    }
}