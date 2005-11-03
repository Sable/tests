public class test153 <E> {
	static class test153Member<F> {}

	// with member element type
	void bar() {
		test153Iter<test153.test153Member<E>> iter = barSet().iterator();
	}
	test153Set<test153Member<E>> barSet()	 { return null; }

	
}

class test153Set<G> {
	test153Iter<G> iterator() { return null; }
}
class test153Iter<H> {
}
class test153Element<I> {
}
