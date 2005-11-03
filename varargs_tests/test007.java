public class test007 {
	public static void main(String[] s) {
		System.out.print('<');
		Y.count(0);
		Y.count(-1, (int[]) null);
		Y.count(-2, (int[][]) null);
		Y.count(1);
		Y.count(2, new int[] {1});
		Y.count(3, new int[] {1}, new int[] {2, 3}, new int[] {4});
		Y.count((byte) 4, new int[][] {new int[] {1}, new int[] {2, 3}, new int[] {4}});
		System.out.print('>');
	}
}
class Y {
	public static int count(int j, int[] values) {
		int result = j;
		System.out.print(' ');
		System.out.print('[');
		for (int i = 0, l = values == null ? 0 : values.length; i < l; i++)
			result += values[i];
		System.out.print(result);
		System.out.print(']');
		return result;
	}
	public static void count(int j, int[] ... values) {
		int result = j;
		System.out.print(' ');
		System.out.print(result);
		System.out.print(':');
		for (int i = 0, l = values == null ? 0 : values.length; i < l; i++)
			result += count(j, values[i]);
		System.out.print('=');
		System.out.print(result);
	}
}
