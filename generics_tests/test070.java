public class test070 {
    
    public static void main(String[] args) {
        Atest070<test070> ax = new Atest070<test070>();
        Atest070<test070> a = bar(ax);
        System.out.println("SUCCESS");
	}
    public static <T> Atest070<T> bar(Atest070<? extends T> a) {
		return null;
    }    
}
class Atest070<E> {
}
