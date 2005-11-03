import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class test051 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			list.add(i);
	    }
	    int sum = 0;
	    for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
	    	sum += iterator.next();
	    }
        System.out.print(sum);
    }
}