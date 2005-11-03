public class test014 {
	public static void main(String[] s) {
		System.out.print('<');
		Y.count((Object) new Integer(1));
		Y.count(new Integer(1));

		Y.count((Object) null);
		Y.count((Object[]) null);
		System.out.print('>');
	}
}
class Y {
	public static void count(Object values) { System.out.print('1'); }
	public static void count(Object ... values) { System.out.print('2'); }
}
