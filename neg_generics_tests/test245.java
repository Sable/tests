interface A<E>{
	E getOne();
}


abstract class B<T extends Number> implements A<T> {
	Number getTwo() {
		return getOne(); // succeeds
	}
}

abstract class C extends B<Integer> {
}

public class test245 {
	void foo(A a, B b, C c){
		Object o= a.getOne();
		Number n1= b.getOne(); // fails
		Number n2= b.getTwo(); // succeeds, but inlining fails
		Integer i = c.getOne(); // succeeds
	}
}
