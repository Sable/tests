public class test110 {
	public test110(String t){
		System.out.println(t);
	}
	public static void main(String[] args) {
		new <String>test110("FAILED");
	}
}
