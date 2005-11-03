public class test202 {

	public boolean test1()	{
		String s = foo("hello");
		return s != null;
	}

	public <F> F foo(F f, F... others) {
		return f;
	}
}
