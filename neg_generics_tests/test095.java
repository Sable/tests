public class test095 {
    
    public static void main(String[] args) {
        Atest095<String, Thread> a = bar();
        String s = a.get();
        System.out.println(s);
	}
    public static <T, U> Atest095<Atest095<T, T>, U> bar() {
		return new Atest095("SUCCESS");
    }    
}
class Atest095<E, F> {
    E e;
    Atest095(E e) { this.e = e; }
    E get() { return this.e; }
}
