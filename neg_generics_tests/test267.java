public class test267<T> {
	T t;
	void foo(test267<?> lhs, test267<?> rhs) {
		lhs = rhs;
		lhs.t = rhs.t;
	}
	void bar(test267<test267<?>> lhs, test267<test267<?>> rhs) {
		lhs = rhs;
		lhs.t = rhs.t;
	}
	void baz(test267<? super Number> lhs, test267<? extends Number> rhs) {
		lhs = rhs;
		lhs.t = rhs.t;
	}
	void baz2(test267<? extends Number> lhs, test267<? extends Number> rhs) {
		lhs = rhs;
		lhs.t = rhs.t;
	}
	void baz3(test267<? extends Number> lhs, test267<? super Number> rhs) {
		lhs = rhs;
		lhs.t = rhs.t;
	}
	void baz4(test267<? super Number> lhs, test267<? super Number> rhs) {
		lhs = rhs;
		lhs.t = rhs.t;
	}
}
