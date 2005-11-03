public class test093 {
    
    public static void main(String[] args) {
        String s = foo(new Atest093<String>("aaa")).bar();
	}
    static <V> V foo(Atest093<String> a) {
        return a.get();
    }
    String bar() {
        return "bbb";
    }
}
class Atest093<E> {
    E e;
    Atest093(E e) { this.e = e; }
    E get() { return this.e; }
}
