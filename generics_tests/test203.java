public class test203 {

	public boolean test1()	{
		String s = foo(null, "hello");
		return s != null;
	}

	public <F> F foo(F f, F... others) {
		return f;
	}
}
