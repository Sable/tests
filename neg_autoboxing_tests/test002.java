public class test002 {
	public static void main(String[] s) {
		new Y().test((byte) 1, 1);
	}
}
class Y {
	void test(Integer i, int j) { System.out.print('n'); }
}
