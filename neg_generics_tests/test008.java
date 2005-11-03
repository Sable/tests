class Foo {} 
public class test008<T extends Object & Comparable<? super T>> {
    public static void main(String[] args) {
        new test008<Foo>();
    }
}
