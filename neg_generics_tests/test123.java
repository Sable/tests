import java.util.ArrayList;

public class test123 {
	void foo() {
		ArrayList<? super Integer> al = new ArrayList<Object>();
		al.add(new Integer(1)); // (1)
		Integer i = al.get(0);  // (2)
	}
}
