public class test090<T> {
	public <A extends T> test090(A... t) {}
	<T> void foo(T... t) {}
	<T> void zip(T t) {}
	void test() {
		new test090<Integer>(10, 20);
		foo(10);
		foo(10, 20);
		zip(10);
	}
}
