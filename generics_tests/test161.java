public class test161<T extends IFoo> {
	
	T element() { return null; }
	void baz(test161<? extends IBar> x) {
		x.element().foo();
		x.element().bar();
	}
}
interface IFoo {
	void foo();
}
interface IBar {
	void bar();
}
