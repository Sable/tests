public class test004 {
    
	public static void main(String[] args) {
		int[] tab = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		loop: for (final float e : tab) {
			sum += e;
			if (e == 3) {
				break loop;
			}
		}
		System.out.println(sum);
	}
}
