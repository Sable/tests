public class test115 {
	public class Mtest115 {
		public <T>Mtest115(T t){
			System.out.println(t);
		}
	}
	public static void main(String[] args) {
		new test115().new <String>Mtest115(new test115());
	}
}
