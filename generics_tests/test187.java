public class test187<T extends Runnable> {
	
	static class Mtest187 <U> {
	}
	
	Mtest187<T> createMtest187() { return new Mtest187<T>(); }

	void foo(test187<?> x, Mtest187<?> mx) {
		mx = x.createMtest187();
	}
}
