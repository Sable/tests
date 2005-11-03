import java.util.*;
public class test020 {
	public static void main(String[] args) {
		String[][] x = {{"X"}, {"Y"}};
		List l = Arrays.asList(x);
		System.out.println(l.size() + " " + l.get(0).getClass().getName());
	}
}
