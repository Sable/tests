public class test113 {
	public class Mtest113 {
		public <T> Mtest113(T t){
			System.out.println(t);
		}
	}
	public static void main(String[] args) {
		new test113().new <String,String>Mtest113("FAILED");
	}
}
