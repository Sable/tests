public class test009 {
	public static int bar() {return 1;}
	public static void main(String[] s) {
		test(bar());
	}
	public static void test(Integer i) { System.out.print('y'); }
}
