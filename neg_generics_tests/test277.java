interface Callable<T> {
	public enum Result {
		GOOD, BAD
	};
	public Result call(T arg);
}

public class test277 implements Callable<String> {
	public Result call(String arg) {
		return Result.GOOD;
	}
  Zork z;
}
