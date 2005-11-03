public class test066 {
	public static Byte b = new Byte((byte)1);
	public static void main(String[] s) {
		b++;
		if (b instanceof Byte) {
			System.out.print("SUCCESS" + b);
		}
	}
}
