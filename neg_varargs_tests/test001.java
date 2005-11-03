public class test001 {
	public static void main(String[] s) {
		Y.byte2(null);
		Y.byte2((byte) 1);
		Y.byte2(new byte[] {});
		Y.byte2(new byte[][] {});
		Y.byte2(new byte[][][] {});

		Y.object(null);
		Y.object((byte) 1);
		Y.object(new byte[] {});
		Y.object(new byte[][] {});
		Y.object(new byte[][][] {});

		Y.object(new String());
		Y.object(new String[] {});
		Y.object(new String[][] {});

		Y.object2(null);
		Y.object2((byte) 1);
		Y.object2(new byte[] {});
		Y.object2(new byte[][] {});
		Y.object2(new byte[][][] {});

		Y.object2(new String());
		Y.object2(new String[] {});
		Y.object2(new String[][] {});

		Y.string(null);
		Y.string(new String());
		Y.string(new String[] {});
		Y.string(new String[][] {});

		Y.string(new Object());
		Y.string(new Object[] {});
		Y.string(new Object[][] {});
	}
}
class Y {
	public static void byte2(byte[] ... values) {}
	public static void object(Object ... values) {}
	public static void object2(Object[] ... values) {}
	public static void string(String ... values) {}
}
