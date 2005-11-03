public class test029 {
	public static void main(String[] s) {
		new Y().test(1, 1);
	}
}
class Y {
	void test(Long i, int j) { System.out.print('n'); }
	void test(long i, Integer j) { System.out.print('y'); }
}
