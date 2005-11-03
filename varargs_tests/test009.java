public class test009 {
	public static void main(String[] s) {
		System.out.print('<');
		Y.print();
		Y.print(new Integer(1));
		Y.print(new Integer(1), new Byte((byte) 3), new Integer(7));
		Y.print(new Integer[] {new Integer(11) });
		System.out.print('>');
	}
}
class Y {
	public static void print(Number ... values) {
		for (int i = 0, l = values.length; i < l; i++) {
			System.out.print(' ');
			System.out.print(values[i]);
		}
		System.out.print(',');
	}
}
