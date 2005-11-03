import java.util.*;

public class test263 {
	void foo(List<String> ls) {
		List<?> l = ls;
		bar(l, ""); 
	}
	<T> void bar(List<? super T> l, T t) {
	}
}
