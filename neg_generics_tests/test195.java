public class test195<T extends Runnable> {
	
	class Mtest195 <U> {
	}
	
	Mtest195<T> createMtest195() { return new Mtest195<T>(); }

	void foo(test195<?> x, Mtest195<?> mx) {
		mx = x.createMtest195();
	}
}
