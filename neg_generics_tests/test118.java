public class test118 {
	public <T> test118(T t){
		System.out.println(t);
	}
	public static void main(String[] args) {
		class Local extends test118 {
			Local() {
				<String>super(new test118(null));
			}
		};
		new Local();
	}
}
