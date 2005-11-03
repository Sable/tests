public class test013 {
	public static void main(String[] s) {
		System.out.print('<');
		Y.test((Object[]) null);
		Y.test(null, null);
		Y.test(null, null, null);
		System.out.print('>');
	}
}
class Y {
	public static void test(Object o, Object o2) { System.out.print('1'); }
	public static void test(Object ... values) { System.out.print('2'); }
}
