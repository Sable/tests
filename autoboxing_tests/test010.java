public class test010 {
	public static byte bar() {return 1;}
	public static void main(String[] s) {
		test(bar());
	}
	public static void test(Byte b) { System.out.print('y'); }
}
