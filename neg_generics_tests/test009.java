public class test009<T extends Object & Comparable<? super T>> {
    public static void main(String[] args) {
        new test009<Foo>();
    }
}
