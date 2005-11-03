class Base<T> {
	public class Inner<U> {
	}
	Inner a;
}

public class test254 extends Base<Integer> {
	class DerivedInner extends Inner {
	}
	test254() {
		a = new DerivedInner();
	}
}
