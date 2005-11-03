import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class test170<V> implements Map<String, V> {
   private Map<String, V> backingMap;
   public int size() { return 0; }
   public boolean isEmpty() { return false; }
   public boolean containsKey(Object key) { return false; }
   public boolean containsValue(Object value) { return false; }
   public V get(Object key) { return null; }
   public V put(String key, V value) { return null; }
   public V remove(Object key) { return null; }
   public void clear() { }
   public Set<String> keySet() { return null; }
   public Collection<V> values() { return null; }
   public void putAll(Map<String, ? extends V> t) { }
   public Set<Map.Entry<String, V>> entrySet() {
      return this.backingMap.entrySet();
   }
}
