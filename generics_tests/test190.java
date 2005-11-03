import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class test190 <K, V> {

	void foo(Iterator<Map.Entry<K,V>> iter) {
		new test190A.Mtest190A<K,V>(iter.next());
	}
}
class test190A <K, V> {
	static class Mtest190A <K, V>  implements Entry<K,V> {
		Mtest190A(Entry<K,V> e) {
		}
		public K getKey() {
			return null;
		}
		public V getValue() {
			return null;
		}
		public V setValue(V value) {
			return null;
		}
	}
}
