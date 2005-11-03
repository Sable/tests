public class test117 {
	public test117(String t){
		System.out.println(t);
	}
	public static void main(String[] args) {
		class Local extends test117 {
			Local() {
				<String>super("FAILED");
			}
		};
		new Local();
	}
}
