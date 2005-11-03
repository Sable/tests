public class test085 {

	<T, U> T foo(T t, U u) {
		return t;
	}
	public static void main(String[] args) {
		System.out.println(new test085().<String,test085>foo("SUCCESS", null));
	}
}
