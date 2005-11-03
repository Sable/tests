public class test105 {

	<T, U extends String> T foo(T t, U u) {
		return t;
	}
	public static void main(String[] args) {
		System.out.println(new test105().<String, test105>foo("SUCCESS", null));
	}
}
