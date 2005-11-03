public class test022 <E extends Cloneable, T extends Thread> {
	void foo(L<E> l1){}
	void foo(L<T> l2){}
	void foo(L l){}
}

class L<E> {
}
