public class test011 {
	public static char bar() {return 'c';}
	public static void main(String[] s) {
		test(bar());
	}
	public static void test(Character c) { System.out.print('y'); }
}
