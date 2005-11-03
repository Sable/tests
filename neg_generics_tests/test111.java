public class test111 {
	public <T> test111(T t){
		System.out.println(t);
	}
	public static void main(String[] args) {
		new <String>test111(new test111(null));
	}
}
