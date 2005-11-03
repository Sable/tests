import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class test192 <K, V> {

	void foo(Iterator<Map.Entry<K,V>> iter) {
		new test190A.Mtest190A<K,V>(iter.next());
	}
}
