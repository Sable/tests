public class test005 {
	public static void main(String[] s) {
		System.out.print('<');
		Y.count();
		Y.count((int[]) null);
		Y.count((int[][]) null);
		Y.count(new int[] {1});
		Y.count(new int[] {1, 2}, new int[] {3, 4});
		Y.count(new int[][] {new int[] {1, 2, 3}, new int[] {4}});
		System.out.print('>');
	}
}
class Y {
	public static int count(int[] values) {
		int result = 0;
		for (int i = 0, l = values == null ? 0 : values.length; i < l; i++)
			result += values[i];
		System.out.print(' ');
		System.out.print(result);
		return result;
	}
	public static void count(int[] ... values) {
		int result = 0;
		for (int i = 0, l = values == null ? 0 : values.length; i < l; i++)
			result += count(values[i]);
		System.out.print('=');
		System.out.print(result);
	}
}
