public class test034 {
	static int i = Y.test();
	public static void main(String[] s) {
		System.out.print(i);
	}
}
class Y {
	public static Byte test() { return new Byte((byte) 1); }
}
