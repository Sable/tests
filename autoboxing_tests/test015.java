public class test015 {
	public static short bar() {return 0;}
	public static void main(String[] s) {
		test(bar());
	}
	public static void test(Short s) { System.out.print('y'); }
}
