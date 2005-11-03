public class test067 {
	public static class Y {
		public static Byte b = new Byte((byte)1);
	}
	public static void main(String[] s) {
		test067.Y.b++;
		if (test067.Y.b instanceof Byte) {
			System.out.print("SUCCESS" + test067.Y.b);
		}
	}
}
