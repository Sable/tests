public class test265 {
    public static void main(String[] args) {
        Foo<?> f1 = new Foo<Integer>();
        f1.bar = f1.bar;
    }
    static class Foo<T> {
       Bar<T> bar = new Bar<T>();
    }
    static class Bar<T> {
        T t;
    }
}
