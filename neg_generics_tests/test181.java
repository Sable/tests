public class test181<T extends IFoo> {
	T element;
	test181(T element) { 
		this.element = element; 
	}
	static void baz(test181<? extends IBar> x) {
		x.element.foo();
		x.element.bar();
	}
	public static void main(String[] args) {
		test181<Foo> x1 = new test181<Foo>(new Foo());
		baz(x1);
		test181<Bar> x2 = new test181<Bar>(new Bar());
		baz(x2);
		test181<FooBar> x3 = new test181<FooBar>(new FooBar());
		baz(x3);
	}
}
interface IFoo {
	void foo();
}
interface IBar {
	void bar();
}
class Foo implements IFoo {
	public void foo() {
		System.out.print("FOO");
	}
}
class Bar implements IBar {
	public void bar() {
		System.out.print("BAR");
	}
}
class FooBar extends Foo implements IBar {
	public void bar() {
		System.out.print("BAR");
	}
}
