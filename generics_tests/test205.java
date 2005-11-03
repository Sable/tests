public class test205 {

	public boolean test1()	{
		foo(null, "hello");
		return true;
	}

	public <F> F foo(F f, F... others) {
		return f;
	}
}
