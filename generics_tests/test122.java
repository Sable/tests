public class test122<T> {

	<U> U[] bar(U[] u)  { 
		System.out.println("SUCCESS");
		return null; }

	static String[] foo() {
		test122<String> xs = new test122<String>();
		return xs.bar(new String[0]);
	}
	public static void main(String[] args) {
		foo();
	}
}
