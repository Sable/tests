public class test086 {
	public <T> test086(T t){
		System.out.println(t);
	}
	public static void main(String[] args) {
		new <String>test086("SUCCESS");
	}
}
