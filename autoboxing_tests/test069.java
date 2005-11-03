public class test069 {
	public static class Y {
		public static Byte b = new Byte((byte)1);
	}
	public static void main(String[] s) {
		++test069.Y.b;
		if (test069.Y.b instanceof Byte) {
			System.out.print("SUCCESS" + test069.Y.b);
		}
	}
}
