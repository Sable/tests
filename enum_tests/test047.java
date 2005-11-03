public class test047 {
	public static void main(String[] args) { ((I) E.A).foo(); }
}
interface I { I foo(); }
enum E implements I {
	A;
	public E foo() {
		System.out.println("SUCCESS");
		return null;
	}
}
