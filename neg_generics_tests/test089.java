public class test089 {
    
    public static void main(String[] args) {
        Atest089<test089> ax = new Atest089<test089>();
        Atest089<String> as = new Atest089<String>();
        Atest089<test089> a = bar(ax, as);
        System.out.println("SUCCESS");
	}
    public static <T,U> Atest089<T> bar(Atest089<? extends U> a, Atest089<? super U> b) {
		return null;
    }    
}
class Atest089<E> {
}
