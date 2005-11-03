import java.util.List;

public class test131 {
	void foo() {
		List<? extends Integer> li= null;
		List<? extends Number> ln= null;
		ln = li;
		li= ln;
	}
}
