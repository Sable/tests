abstract class Foo {
	abstract protected boolean accept(Object o);
}

public class test076 extends Foo {
	@Override 
	protected boolean accept(Object o) { return false; }
}
