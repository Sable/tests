import java.util.*;

public class test259 {
	List l= null; 

	void add(String s) {
		l.add(s);
	}
	
	void addAll(String[] ss) {
		l.addAll(Arrays.asList(ss));
	}
	
	String[] get() {
		return (String[])l.toArray(new String[l.size()]);
	}
}
