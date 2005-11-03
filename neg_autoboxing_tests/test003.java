public class test003 {
	public static void main(String[] s) {
		new Y().test(1, 1);
		new Y().test(new Integer(1), new Integer(1));
	}
}
class Y {
	void test(Integer i, int j) {}
	void test(int i, Integer j) {}
}
