public class test031 {
	public static void main(String[] s) {
		new Y().test(new Integer(1), 1);
		new Y().test(1, new Integer(1));
	}
}
class Y {
	void test(Integer i, int j) { System.out.print(1); }
	void test(int i, Integer j) { System.out.print(2); }
}
