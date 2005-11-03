public class test016 {
	public static boolean bar() {return true;}
	public static void main(String[] s) {
		test(bar());
	}
	public static void test(Boolean b) { System.out.print('y'); }
}
