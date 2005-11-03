public class test182<T extends Foo> {
	T element;
	test182(T element) { 
		this.element = element; 
	}
	static void baz(test182<? extends IBar> x) {
		x.element.foo();
		x.element.bar();
	}
	public static void main(String[] args) {
		baz(new test182<FooBar>(new FooBar()));
		baz(new test182<Bar>(new Bar()));
	}
}
interface IBar {
	void bar();
}

class Bar implements IBar {
	public void bar() {
		System.out.print("BAR");
	}
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
