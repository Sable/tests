public class test013 {
    
	public static void main(String[] args) {
		int[] tab = new int[] {};
		System.out.print("SUC");
		loop: for (final int e : tab) {
			System.out.print("1x");
			continue loop;
		}
		System.out.println("CESS");
	}
}
