public class test076 {
    
    public static void main(String[] args) {
        Atest076<test076> ax = new Atest076<test076>(new test076());
        Atest076<String> a = bar(ax, true);
        String s = a.get();
        System.out.println(s);
	}
    public static <T> Atest076<T> bar(Atest076<?> a, boolean recurse) {
        if (recurse) {
	        Atest076<String> as = bar(a, false);
			String s = as.get();
        }
		return new Atest076("SUCCESS");
    }    
}
class Atest076<E> {
    E e;
    Atest076(E e) { this.e = e; }
    E get() { return this.e; }
}
