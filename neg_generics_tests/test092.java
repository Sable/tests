public class test092 {
    
    public static void main(String[] args) {
        boolean b = foo(new Atest092<String>("aaa")).equals(args);
	}
    static <V> V foo(Atest092<String> a) {
        return a.get();
    }
    String bar() {
        return "bbb";
    }
}
class Atest092<E> {
    E e;
    Atest092(E e) { this.e = e; }
    E get() { return this.e; }
}
