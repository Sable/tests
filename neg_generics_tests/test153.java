import java.util.ArrayList;
public class test153 <T> {
	test153[] foo() {
		ArrayList<test153> list = new ArrayList();
		return list.toArray(new test153[list.size()]);
	}
	public static void main(String[] args) {
	}
}
