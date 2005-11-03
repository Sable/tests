public class test014 {
	public static void main(String[] args) {
		int[] tab = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		int i = 0;
		loop1: while(true) {
			i++;
			loop: for (final int e : tab) {
				sum += e;
				if (i == 3) {
					break loop1;
				} else if (e == 5) {
					break loop;
				} else {
					continue;
				}
			}
		}
		System.out.println(sum);
	}
}