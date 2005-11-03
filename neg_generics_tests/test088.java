public class test088 {
    
    public static void main(String[] args) {
        Atest088<test088> ax = new Atest088<test088>();
        Atest088<test088> a = bar(ax);
	}
    public static <T> Atest088<T> bar(Atest088<?> a) {
		return null;
    }    
}
class Atest088<E extends test088> {
}
