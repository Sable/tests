public class test119<T> extends RuntimeException {
	public static void main(String[] args) {
		new Object() {
			public void m() throws test119<String> {
				System.out.println("SUCCESS");
			}
		}.m();
	}
}
