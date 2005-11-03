public class test072 {
    
    public static void main(String[] args) {
        Atest072<test072> ax = new Atest072<test072>();
        Atest072<test072> a = bar(ax);
        System.out.println("SUCCESS");
	}
    public static <T> Atest072<T> bar(Atest072<?> a) {
		return null;
    }    
}
class Atest072<E> {
}
