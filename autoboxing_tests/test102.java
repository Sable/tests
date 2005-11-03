public class test102 extends A {
    public void m(Object o) { System.out.println("SUCCESS"); }
    public static void main(String[] args) { ((A) new test102()).m(1); }
}
interface I { void m(Object o); }
abstract class A implements I {
	public final void m(int i) {
		System.out.print("SUCCESS + ");
		m(new Integer(i));
	}
	public final void m(double d) {
		System.out.print("FAILED");
	}
}
