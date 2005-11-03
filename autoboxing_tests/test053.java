public class test053 {
	public static Boolean foo() { return Boolean.FALSE; }
	public static void main(String[] args) {
		Boolean b = foo();
		
		if (!b) {
			System.out.print("THEN");
		} else {
			System.out.print("ELSE");
		}
    }
}