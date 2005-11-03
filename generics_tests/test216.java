public class test216 {
	void foo(L l, C<? super test216> c) {
		bar(l, c);
	}
	<T> void bar(L<T> l, C<? super T> c) { 
	}	
}
class C<E> {}
class L<E> {}