public class test112 {

	<T> void foo(T t) {
		return;
	}
	public static void main(String[] args) {
		System.out.println(new test112().<String>foo(new test112()));
	}
}
