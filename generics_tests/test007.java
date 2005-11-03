public class test007 <T> {
    T foo(T t) {
        System.out.println(t);
        return t;
    }
    public static void main(String[] args) {
        new test007<test007Y>() {
            void run() {
                foo(new test007Y());
            }
        }.run();
    }
}
class test007Y {
    public String toString() {
        return "SUCCESS";
    }
}
