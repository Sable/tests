import java.util.*;
public class test021 {
	public static void main(String[] args) {
		String[][] x = {{"X"}, {"Y"}};
		System.out.println(asList(x[0], x[1]).get(1).getClass().getName());
	}
	static <U> List<U> asList(U u1, U... us) {
		List<U> result = new ArrayList<U>();
		result.add(u1);
		result.add(us[0]);
		return result;
	}
}
