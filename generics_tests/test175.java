public class test175<T> {
	T element;
	static void foo(test175<? super Exception> out, test1751<? extends Exception> in) {
		out.element = in.element;
	}
	public static void main(String[] args) {
		System.out.println("SUCCESS");
	}
}
class test1751<U>{
	U element;
}
