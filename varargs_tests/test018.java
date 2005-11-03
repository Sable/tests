public class test018 {
	public static void main(String[] s) {
		Y.count(new int[0], 1);
		Y.count(new int[0], 1, 1);
	}
}
class Y {
	public static void count(int[] array, int ... values) { System.out.print(1); }
	public static void count(Object o, int ... values) { System.out.print(2); }
}
