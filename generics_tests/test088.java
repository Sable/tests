public class test088 {
	public <T> test088(T t){
		System.out.println(t);
	}
	public static void main(String[] args) {
		class Local extends test088 {
			Local() {
				<String>super("SUCCESS");
			}
		};
		new Local();
	}
}
