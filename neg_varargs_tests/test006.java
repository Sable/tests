public class test006 {
	public static void main(String[] s) {
		Y.count(new int[0]);
		Y.count(new int[0], null);
	}
}
class Y {
	public static void count(int[] array, int ... values) { System.out.print(0); }
	public static void count(int[] array, int[][] ... values) { System.out.print(1); }
}
