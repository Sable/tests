import java.util.Iterator;
import java.util.Set;

class test168 <K, V> {
	static class Entry<K, V> {}
	void foo() {
		Iterator<Entry<K,V>> i = entrySet().iterator();
	}
	Set<Entry<K,V>> entrySet()	 { return null; }
}
