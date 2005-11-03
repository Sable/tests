public class test002 {
	public static void main(String[] s) {
		Y y = new Y(null);
		y = new Y(true, null);
		y = new Y('i', null);
	}
}
class Y {
	public Y(int ... values) {}
	public Y(boolean b, Object ... values) {}
	public Y(char c, int[] ... values) {}
}
