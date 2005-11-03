public class test208<T> {
	void foo() {
		new test208<test208<?>>();
		new test208<test208<? extends String>>();
		new test208<test208<?>>(){};
		new test208<test208<? extends String>>(){};
	}
}