public class test162<T extends IFoo> {
	T element;
	test162(T element) { 
		this.element = element; 
	}
	static void baz(test162<? extends IBar> x) {
		x.element.foo();
		x.element.bar();
	}
	public static void main(String[] args) {
		test162<FooBar> x3 = new test162<FooBar>(new FooBar());
		baz(x3);
	}
}
interface IFoo {
	void foo();
}
interface IBar {
	void bar();
}
class FooBar implements IFoo, IBar {
	public void foo() {
		System.out.print("FOO");
	}
	public void bar() {
		System.out.print("BAR");
	}
}
