public class test264 {
    public static void main(String[] args) {
        Foo<?> f1 = new Foo<Integer>();
        Foo<?> f2 = new Foo<String>();
        f1.bar = f2.bar;
    }
    static class Foo<T> {
       Bar<T> bar = new Bar<T>();
    }
    static class Bar<T> {
        T t;
    }
}
