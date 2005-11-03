public class test071 {
    
    public static void main(String[] args) {
        Atest071<test071> ax = new Atest071<test071>();
        Atest071<test071> a = bar(ax);
        System.out.println("SUCCESS");
	}
    public static <T> Atest071<T> bar(Atest071<? super T> a) {
		return null;
    }    
}
class Atest071<E> {
}
