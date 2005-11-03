public class test152 <E> {
	static class test152Member<F> {}

	// with toplevel element type
	void foo() {
		test152Iter<test152Element<E>> iter = fooSet().iterator();
	}
	test152Set<test152Element<E>> fooSet()	 { return null; }

	// with member element type
	void bar() {
		test152Iter<test152Member<E>> iter = barSet().iterator();
	}
	test152Set<test152Member<E>> barSet()	 { return null; }

	
}

class test152Set<G> {
	test152Iter<G> iterator() { return null; }
}
class test152Iter<H> {
}
class test152Element<I> {
}
