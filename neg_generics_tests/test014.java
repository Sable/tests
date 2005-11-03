public class test014 <T extends String> {
    void foo(T t) {
    }
    void bar(String x) {
        foo(x);
    }
    public static void main(String[] args) {
        new test014<String>().foo(new Object());
    }
}
