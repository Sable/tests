public class test003 {
	public static void main(String[] args) {
	    final int i;
		int[] tab = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		loop: for (final int e : tab) {
			sum += e;
			if (e == 3) {
			    i = 1;
				break loop;
			}
		}
		System.out.println(sum + i);
	}
}
