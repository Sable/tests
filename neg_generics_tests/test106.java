public class test106 {

	<T, U extends String> T foo(T t, U u) {
		return t;
	}
	public static void main(String[] args) {
		System.out.println(new test106().<String>foo("SUCCESS", null));
	}
}
