public class test163<T extends Foo> {
	T element;
	test163(T element) { 
		this.element = element; 
	}
	static void baz(test163<? extends FooBar> x) {
		x.element.foo();
		x.element.bar();
	}
	public static void main(String[] args) {
		test163<FooBar> x3 = new test163<FooBar>(new FooBar());
		baz(x3);
	}
}
interface IBar {
	void bar();
}
class Foo {
	public void foo() {
		System.out.print("FOO");
	}
}
class FooBar extends Foo implements IBar {
	public void bar() {
		System.out.print("BAR");
	}
}
