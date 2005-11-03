public class test012 {
	public static float bar() {return 0.0f;}
	public static void main(String[] s) {
		test(bar());
	}
	public static void test(Float f) { System.out.print('y'); }
}
