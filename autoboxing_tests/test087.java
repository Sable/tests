import java.util.*;

public class test087 {
	public static void main(String[] args) {
		List<Boolean> lb = new ArrayList<Boolean>();
		lb.add(true);
		Iterator<Boolean> iterator = lb.iterator();
		assert args != null : iterator.next();
	    System.out.println("SUCCESS");
	}
}
