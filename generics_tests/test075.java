public class test075 {
    
    public static void main(String[] args) {
        Atest075<test075> ax = new Atest075<test075>();
        Atest075<String> a = bar(ax);
        System.out.println("SUCCESS");
	}
    public static <T> Atest075<T> bar(Atest075<?> a) {
		 if (a == null) {
        	Atest075<String> as = bar(a);
        	String s = as.get();
		}
		return null;
    }    
}
class Atest075<E> {
    E get() { return null; }
}
