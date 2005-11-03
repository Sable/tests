public class test210 {

	public boolean test1()	{
		String[] s = foo(null, new String[]{ "hello" });
		return s != null;
	}

	public <F> F foo(F f, F... others) {
		return f;
	}
}
