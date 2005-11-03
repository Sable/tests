import java.util.*;

public class test279 {
	public static void main(String[] args) {
		try {
			List list = new ArrayList();
			String s = "this shouldn't work";
			list.add(s);
			List<Integer> listInt = list;
			int i = listInt.get(0);
		} catch(ClassCastException e) {
			System.out.println("SUCCESS");
		}
	}
}
