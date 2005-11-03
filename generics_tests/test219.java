public class test219<E> {
	
	<T> test219<T> foo(test219<T> xt) {
		return null;
	}
	test219<E> identity() {
		return this;
	}
	void bar(test219 x) {
		test219<String> xs = foo(x).identity();
	}
}
