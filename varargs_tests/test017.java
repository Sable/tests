public class test017 {
	public static void main(String[] s) {
		Y.count(1, 1);
	}
}
class Y {
	public static void count(long i, int j) { System.out.print(1); }
	public static void count(int ... values) { System.out.print(2); }
}
