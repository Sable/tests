public class test013 {
	public static double bar() {return 0.0;}
	public static void main(String[] s) {
		test(bar());
	}
	public static void test(Double d) { System.out.print('y'); }
}
