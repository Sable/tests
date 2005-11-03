class Base<T> {
	public class Inner<U> {
	}
	Inner a;
}

public class test255 extends Base<Integer> {
	class DerivedInner extends Inner<Float> {
	}
	test255() {
		a = new DerivedInner();
	}
}
