import java.io.IOException;

public abstract class test187<T extends Runnable> {
	
	public abstract <T extends Exception> T bar(T t);

	static void foo(test187 x) {
		x.<Exception>bar(null);
		
		class R implements Runnable {
			public void run() {
			}
		}
		test187<R> xr = new test187<R>(){  
			public <T> T bar(T t) { 
				return t; 
			}
		};
		IOException e = xr.bar(new IOException());
	}
}
