public class test049 {
	
	public static void main(String[] args) {
		E.A.bar();
	}
}
enum E {
	A {
		void bar() {
			new test049(){
				void baz() {
					new M();
				}
			}.baz();
		}
	};
	abstract void bar();
	
	class M {
		M() {
			System.out.println("SUCCESS");
		}
	}
}
