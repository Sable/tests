public class test125 {
	public static void main(String[] args) {
		test125List<? super Integer> lx = new test125List<Integer>();
		lx.slot = new Integer(1);
		Integer i = lx.slot;
    }    	
}
class test125List<E> {
    E slot;
}
