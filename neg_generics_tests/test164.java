public class test164<T> {

	public class A <U> {
		
		public class B <V> {
			
		}
	}
	public static void main(String[] args) {
		
		test164<String>.A.B<String> bs;
	}
}
