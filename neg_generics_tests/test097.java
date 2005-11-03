public class test097 {
    
    public static void main(String[] args) {
        Atest097<test097> ax = new Atest097<test097>(new test097());
        Atest097<String> as = new Atest097<String>("");
        ax = (Atest097)bar(ax);
	}
    public static <T> T bar(Atest097<?> a) {
		return a.get();
    }    
}
class Atest097<E> {
	 E e;
    Atest097(E e) { this.e = e; }
    E get() { return this.e; }
}
