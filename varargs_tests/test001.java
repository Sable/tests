public class test001 {
	public static void main(String[] s) {
		System.out.print('<');
		Y y = new Y();
		y = new Y(null);
		y = new Y(1);
		y = new Y(1, 2, (byte) 3, 4);
		y = new Y(new int[] {1, 2, 3, 4 });
		
		Y.count();
		Y.count(null);
		Y.count(1);
		Y.count(1, 2, (byte) 3, 4);
		Y.count(new int[] {1, 2, 3, 4 });
		System.out.print('>');
	}
}
class Y {
	public Y(int ... values) {
		int result = 0;
		for (int i = 0, l = values == null ? 0 : values.length; i < l; i++)
			result += values[i];
		System.out.print(result);
		System.out.print(' ');
	}
	public static void count(int ... values) {
		int result = 0;
		for (int i = 0, l = values == null ? 0 : values.length; i < l; i++)
			result += values[i];
		System.out.print(result);
		System.out.print(' ');
	}
}
