public class test027 {
	public static void main(String[] s) {
		new Y().test(1);
	}
}
class Y {
	private void test(int i) { System.out.print('n'); }
	void test(int... i) { System.out.print('n'); }
	public void test(Integer i) { System.out.print('y'); }
}
