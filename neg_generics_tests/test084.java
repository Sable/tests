public class test084 {
	public static void main(String[] args) {
		test084List<?> lx = new test084List<test084>();
		test084 x = lx.get();
		lx.add(null);
		lx.add(x);
		lx.slot = x;
		lx.addAll(lx);
    }    	
}
class test084List<E extends test084> {
    E slot;
    void add(E e) {}
    E get() { return null; 
    }
    void addAll(test084List<E> le) {}
}
