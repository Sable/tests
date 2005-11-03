public class test048 {
	
	public static void main(String[] args) {
		E.A.bar();
	}
}
enum E {
	A {
		void bar() {
			new M();
		}
	};
	abstract void bar();
	
	class M {
		M() {
			System.out.println("SUCCESS");
		}
	}
}
