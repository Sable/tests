public class test035 {
	static Object o = Y.test();
	public static void main(String[] s) {
		System.out.print(o);
	}
}
class Y {
	public static int test() { return 1; }
}
