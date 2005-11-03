public class test065 {
	public static void main(String[] s) {
		Byte b = new Byte((byte)1);
		b++;
		if (b instanceof Byte) {
			System.out.println("SUCCESS" + b);
		}
	}
}
