public class test007 {
	public static void main(String[] s) {
		Y.count(new int[0], 1);
		Y.count(new int[0], 1, 1);
		Y.count(new int[0], 1, 1, 1);
	}
}
class Y {
	public static void count(int[] array, int ... values) {}
	public static void count(int[] array, int[] ... values) {}
	public static void count(int[] array, int i, int ... values) {}
}
