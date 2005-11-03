class Cache<K, V> {
}

class Index<K, V> {
  public Index(Cache<?, V> parentCache) {
  }
}

public class test154 extends Cache<Integer, String> {
  class AnIndex extends Index<String, String> {
    public AnIndex() {
      super(test154.this); // <-- Eclipse cannot find the constructor!
    }
  }
}
