public class test091 {
    
    public static void main(String[] args) {
        String s = foo(new Atest091<String>("aaa"));
	}
    static <V> V foo(Atest091<String> a) {
        return a.get();
    }
}
class Atest091<E> {
    E e;
    Atest091(E e) { this.e = e; }
    E get() { return this.e; }
}
