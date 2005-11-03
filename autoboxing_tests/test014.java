public class test014 {
	public static long bar() {return 0;}
	public static void main(String[] s) {
		test(bar());
	}
	public static void test(Long l) { System.out.print('y'); }
}
