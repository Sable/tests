public class test079 {
    
    public static void main(String[] args) {
    	Object o = foo;
    	System.out.println("SUCCESS");
	}
    public static <T> T bar(Atest079<?> a) {
		return null;
    }    
    static Atest079<test079> foo = bar(new Atest079<test079>(new test079()));
}
class Atest079<E> {
	 E e;
    Atest079(E e) { this.e = e; }
    E get() { return this.e; }
}

