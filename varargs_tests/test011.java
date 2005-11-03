public class test011 {
	public static void main(String[] s) {
		String[] T_NAMES = new String[] {"foo"};
		String error = "error";
		Y.format("E_UNSUPPORTED_CONV", new Integer(0));
		Y.format("E_SAVE", T_NAMES[0], error);
	}
}
class Y {
	public static String format(String key) { return null; }
	public static String format(String key, Object ... args) { return null; }
}
