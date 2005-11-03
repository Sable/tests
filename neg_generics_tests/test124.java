import java.util.ArrayList;

public class test124 {
	void foo() {
		ArrayList<? extends Integer> al = new ArrayList<Integer>();
		al.add(new Integer(1)); // (1)
	}
}
