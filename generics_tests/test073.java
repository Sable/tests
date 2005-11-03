public class test073 {
    
    public static void main(String[] args) {
        Atest073<test073> ax = new Atest073<test073>();
        Atest073<String> as = new Atest073<String>();
        Atest073<test073> a = bar(ax, as);
        System.out.println("SUCCESS");
	}
    public static <T,U> Atest073<T> bar(Atest073<?> a, Atest073<? super U> b) {
		return null;
    }    
}
class Atest073<E> {
}
