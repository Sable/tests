import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class test079 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		boolean b = true;
		for (int i = 0; i < 5; i++) {
			list.add(i);
	    }
		int val = 0;
	    for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
	    	val = ~ iterator.next();
	    }
	    System.out.println(val);
    }
}
