public class test268 {

	public static void main(String[] args) {
		Number n= null;
		Integer i= null;
		new test268().nextTry(i, n);
		new test268().nextTry2(n, i);
	}	
	
	<I, N extends I> void nextTry(I i, N n) {}
	
	<N, I extends N> void nextTry2(N n, I i) {}	
}
