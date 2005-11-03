interface I<T> {
	<S extends T> void doTest(S[] a);
}

abstract class AbstractTest<U> implements I<U> {
	public <V extends U> void doTest(V[] a) {}
}

public class test243<M> extends AbstractTest<M> {}
