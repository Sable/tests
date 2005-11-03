import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class test272<E> {
	public void test(List list,final Comparator comparator, test272 x) {
		foo(list, comparator);
		bar(list, comparator);
		
		x.foo(list, comparator);
		x.bar(list, comparator);
	}

	<T> void foo(List<T> lt, Comparator<? super T> ct) {
	}
	static <T> void bar(List<T> lt, Comparator<? super T> ct) {
	}
 Zork z;
}
