public class test114 {
	public class Mtest114 {
		public Mtest114(String t){
			System.out.println(t);
		}
	}
	public static void main(String[] args) {
		new test114().new <String>Mtest114("FAILED");
	}
}
