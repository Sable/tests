public class test019 {
	public static void main(String[] s) {
		Y.count(new int[0]);
	}
}
class Y {
	public static void count(int[] array, int ... values) { System.out.print(1); }
	public static void count(int[] array, int[] ... values) { System.out.print(2); }
}
