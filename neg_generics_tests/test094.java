public class test094 {
    
    public static void main(String[] args) {
        String s = foo(new Atest094<String>("aaa")).bar();
	}
    static <V> V foo(Atest094<String> a) {
        return a.get();
    }
    String bar() {
        return "bbb";
    }
}
class Atest094<E> {
    E e;
    Atest094(E e) { this.e = e; }
    E get() { return this.e; }
}
