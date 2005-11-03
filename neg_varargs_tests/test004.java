public class test004 {
	public static void main(String[] s) {
		Y.string(null);
		Y.string2(null);
		Y.int2(null);
	}
}
class Y {
	public static void string(String values) { System.out.print('1'); }
	public static void string(String ... values) { System.out.print('2'); }
	public static void string2(String[] values) { System.out.print('1'); }
	public static void string2(String[] ... values) { System.out.print('2'); }
	public static void int2(int[] values) { System.out.print('1'); }
	public static void int2(int[] ... values) { System.out.print('2'); }
}
