public class test120<T> extends RuntimeException {
	public static void main(String[] args) {
		try {
			throw new test120<String>();
		} catch(test120<String> e) {
			System.out.println("test120<String>");
		} catch(test120<test120<String>> e) {
			System.out.println("test120<test120<String>>");
		} catch(RuntimeException e) {
			System.out.println("RuntimeException");
		}
	}
}
