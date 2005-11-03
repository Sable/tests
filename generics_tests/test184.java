import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;
public class test184 extends AbstractSet<Entry<String,Integer>> {
	public Iterator<Entry<String, Integer>> iterator() {
		return new Iterator<Entry<String,Integer>>() {
			public boolean hasNext() {return false;}
			public Entry<String, Integer> next() {return null;}
			public void remove() {}	
		};
	}
	public int size() {return 0;}
}