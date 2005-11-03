public class test078 {
    
    public static void main(String[] args) {
    	foo();
    	System.out.println("SUCCESS");
	}
    public static <T> T bar(Atest078<?> a) {
		return null;
    }    
    public static Atest078<test078> foo() {
        Atest078<test078> ax = new Atest078<test078>(new test078());
       return bar(ax);
    }
}
class Atest078<E> {
	 E e;
    Atest078(E e) { this.e = e; }
    E get() { return this.e; }
}

