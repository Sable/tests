public class test121 <T> {
	static void foo(test121<?> xany) { 
		System.out.println("SUCCESS");
	}
	public static void main(String[] args) {
		foo(new test121<Object[]>());
	}
}
