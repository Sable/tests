import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class test078 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		boolean b = true;
		for (int i = 0; i < 5; i++) {
			list.add(i);
	    }
		int sum = 0;
	    for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
	    	sum = sum + iterator.next();
	    }
	    System.out.println(sum);
    }
}
