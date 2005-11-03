public class test220<E> {
	
	<T> test220<T> foo(test220<T> xt, test220<T> xt2) {
		return null;
	}
	test220<E> identity() {
		return this;
	}
	void bar(test220 x, test220<String> xs) {
		test220<String> xs2 = foo(x, xs).identity();
	}
}
