import java.io.Serializable;
import java.util.List;

public class test273 {
	void foo1(List<? super int[]> l) {
		int i = l.get(0).length;
	}
	void foo2(List<? super int[]> l) {
		Object o = l.get(0).toString();
	}
	void foo3(List<? super int[]> l, Serializable s) {
		boolean b = true;
		Serializable s2 = b ? l.get(0) : s;
	}
}
