class Base<T> {
	public class Inner {
	}
	Inner a;
}

public class test253 extends Base<Integer> {
	class DerivedInner extends Inner {
	}
	test253() {
		a = new DerivedInner();
	}
}
