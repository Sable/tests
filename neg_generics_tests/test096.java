public class test096 {
    
    public static void main(String[] args) {
        Atest096<String> a = bar(new test096());
        String s = a.get();
        System.out.println(s);
	}
    public static <T> Atest096<T> bar(T t) {
		return new Atest096("SUCCESS");
    }    
}
class Atest096<E> {
    E e;
    Atest096(E e) { this.e = e; }
    E get() { return this.e; }
}
