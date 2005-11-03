public class test165<T> {

	public static class A <U> {
		
		public class B <V> {
			
		}
	}
	public static void main(String[] args) {
		
		test165<String>.A.B<String> bs;
	}
}
