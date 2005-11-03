public class test028 {
	public static void main(String[] s) {
		new Y().test(1);
	}
}
class Y {
	void test(Integer i) { System.out.print('n'); }
	void test(long i) { System.out.print('y'); }
}
