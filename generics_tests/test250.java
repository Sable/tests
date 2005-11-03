public class test250 {
	Typed<B> itsList;
	Typed<A> itsTyped;
	public void test() {
		method(itsList, itsTyped);
	}
	public <T> void method(Typed<? extends T> arg1, Typed<? super T> arg3) {
	}
	interface A {
	}
	class B implements A {
	}
	class Typed<T> {
	}
}
