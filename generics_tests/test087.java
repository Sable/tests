public class test087 {
	public class Mtest087 {
		public <T> Mtest087(T t){
			System.out.println(t);
		}
	}
	public static void main(String[] args) {
		new test087().new <String>Mtest087("SUCCESS");
	}
}
