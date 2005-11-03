import java.util.*;

public class test086 {
	public static void main(String[] args) {
		List<Boolean> lb = new ArrayList<Boolean>();
		lb.add(true);
		Iterator<Boolean> iterator = lb.iterator();
		assert iterator.next() : "failed";
	    System.out.println("SUCCESS");
	}
}
