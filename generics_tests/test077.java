public class test077 {
    
    public static void main(String[] args) {
        Atest077<String, Thread> a = bar();
        String s = a.get();
        System.out.println(s);
	}
    public static <T, U> Atest077<T, U> bar() {
		return new Atest077("SUCCESS");
    }    
}
class Atest077<E, F> {
    E e;
    Atest077(E e) { this.e = e; }
    E get() { return this.e; }
}
