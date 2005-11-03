public class test026 {
	public static void main(String[] s) {
		Y.test(1);
	}
}
class Y {
	private static void test(int i) { System.out.print('n'); }
	static void test(int... i) { System.out.print('n'); }
	public static void test(Integer i) { System.out.print('y'); }
}
