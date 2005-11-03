import java.util.List;
import java.util.ArrayList;

public class test016 {
	public static void main(String[] args) {
		String[] tab = new String[] {"SUCCESS"};
		List list = new ArrayList();
		for (String arg : tab) {		
			list.add(arg);
		}
		for (Object arg: list) {
			System.out.print(arg);
		}
	}
}