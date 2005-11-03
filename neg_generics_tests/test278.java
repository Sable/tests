import java.util.*;

public class test278 {
	static public <T extends Collection> void addAll(T a, T b) {
		a.addAll(b);
	}
	static public void main(String[] args) {
		Collection<Integer> a = new ArrayList<Integer>();
		Collection<String> b = new ArrayList<String>();
		b.add("string");
		addAll(a, b);
		try {
			System.out.println(a.iterator().next().intValue()); // ClassCastException
		} catch(ClassCastException e) {
			System.out.println("SUCCESS");
		}
	}
  Zork z;
}
