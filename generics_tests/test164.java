public class test164<T extends Foo> {
	T element;
	test164(T element) { 
		this.element = element; 
	}
	static void baz(test164<? extends IBar> x) {
		x.element.foo();
		x.element.bar();
	}
	public static void main(String[] args) {
		test164<FooBar> x3 = new test164<FooBar>(new FooBar());
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
