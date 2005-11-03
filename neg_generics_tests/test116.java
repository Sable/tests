public class test116 {
	public <T> test116(T t){
		System.out.println(t);
	}
	public static void main(String[] args) {
		class Local extends test116 {
			Local() {
				<String,String>super("FAILED");
			}
		};
		new Local();
	}
}
