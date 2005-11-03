public class test030 {
	public static void main(String[] s) {
		Y.test(1, new Integer(2), -3);
	}
}
class Y {
	public static void test(int ... i) { System.out.print('y'); }
}
