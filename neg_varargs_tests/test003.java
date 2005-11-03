public class test003 {
	public static void main(String[] s) {
		Y y = new Y(null);
		y = new Y(true, null);
		y = new Y('i', null);
	}
}
class Y extends Z {
	public Y(int ... values) { super(values); }
	public Y(boolean b, Object ... values) { super(b, values); }
	public Y(char c, int[] ... values) {}
}
class Z {
	public Z(int ... values) {}
	public Z(boolean b, Object ... values) {}
	public Z(char c, int[] ... values) {}
}
