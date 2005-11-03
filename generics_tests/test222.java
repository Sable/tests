public class test222<E> {
	
	<T,U> test222<U> foo(test222<T> xt, test222<U> xt2) {
		return null;
	}
	test222<E> identity() {
		return this;
	}
	void bar(test222 x, test222<String> xs) {
		test222<String> xs2 = foo(x, xs).identity();
	}
}
