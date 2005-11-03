public class test071 {
	static Byte b = 1;
	public static void main(String[] s) {
		++b;
		if (b instanceof Byte) {
			System.out.println("SUCCESS");
		}
	}
}
