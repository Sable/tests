public class test221<E> {
	
	<T,U> test221<T> foo(test221<T> xt, test221<U> xt2) {
		return null;
	}
	test221<E> identity() {
		return this;
	}
	void bar(test221 x, test221<String> xs) {
		test221<String> xs2 = foo(x, xs).identity();
	}
}
