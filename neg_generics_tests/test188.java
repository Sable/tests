import java.io.IOException;
public abstract class test188<T extends Runnable> {
	public abstract <T extends Exception> T bar(T t);
	static void foo(test188 x) {
		x.<Exception>bar(null);
		class R implements Runnable {
			public void run() {}
		}
		test188<R> xr = new test188<R>(){  
			public <T extends Exception> T bar(T t) { return t; }
		};
		IOException e = xr.bar(new IOException());
	}
}
