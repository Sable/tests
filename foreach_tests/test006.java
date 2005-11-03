public class test006 {
    
	public static void main(String[] args) {
		int[][] tab = new int[][] {
			new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
			new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
		};
		for (final int[] e : tab) {
			System.out.print(e[0]);
		}
	}
}
