public class test266<T> {
	T t;
	void foo(test266<?> lhs, test266<?> rhs) {
		lhs = rhs;
		lhs.t = rhs.t;
	}
	void bar(test266<test266<?>> lhs, test266<test266<?>> rhs) {
		lhs = rhs;
		lhs.t = rhs.t;
	}}

