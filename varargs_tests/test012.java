public class test012 {
	public static void main(String[] s) {
		System.out.print('<');
		Y.count(null);
		Y.count(1);
		Y.count(1, 2);

		Z.count(1L, 1);
		Z.count(1, 1);
		Z.count(1, null);
		Z.count2(1, null);
		Z.count2(1L, null);
		System.out.print('>');
	}
}
class Y {
	public static void count(int values) { System.out.print('1'); }
	public static void count(int ... values) { System.out.print('2'); }
}
class Z {
	public static void count(long l, long values) { System.out.print('3'); }
	public static void count(int i, int ... values) { System.out.print('4'); }
	public static void count2(int i, int values) { System.out.print('5'); }
	public static void count2(long l, int ... values) { System.out.print('6'); }
}
