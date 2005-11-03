public class test098 {
    
    public static void main(String[] args) {
        Atest098<test098> ax = new Atest098<test098>(new test098());
        Atest098<String> as = new Atest098<String>("");
        ax = (Atest098<test098>)bar(ax);
	}
    public static <T> T bar(Atest098<?> a) {
		return a.get();
    }    
}
class Atest098<E> {
	 E e;
    Atest098(E e) { this.e = e; }
    E get() { return this.e; }
}
