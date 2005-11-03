public class test109 {
	public <T> test109(T t){
		System.out.println(t);
	}
	public static void main(String[] args) {
		new <String, String>test109("FAILED");
	}
}
