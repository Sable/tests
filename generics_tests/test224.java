public class test224 {
	
	<T extends A> T foo(T t) {
		return t;
	}
	public static void main(String[] args) {
		new test224().bar();
	}
	void bar() {
		B b = foo(new B());
	}
}

class A {}
class B extends A {}

