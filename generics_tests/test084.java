public class test084 {

	static <T, U> T foo(T t, U u) {
		return t;
	}
	public static void main(String[] args) {
		System.out.println(test084.<String,test084>foo("SUCCESS", null));
	}
}
