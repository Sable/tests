import java.util.*;
public class test249
{
	List<B> itsList;
	B itsB;
	MyTyped itsTyped;
	
	
	public void test()
	{
		method (itsList, itsB, itsTyped);
	}
	
	public <T> void method (List<? extends T> arg1, T arg2, Typed<? super T> arg3)
	{
	}
	
	interface A{}
	class B implements A{}
	class Typed<T>{}
	class MyTyped extends Typed<A>{}

}
