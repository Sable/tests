import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class test077 {

	public static void main(String[] args) {
		List<Boolean> list = new ArrayList<Boolean>();
		boolean b = true;
		for (int i = 0; i < 5; i++) {
			list.add((i % 2 == 0) && b);
	    }
	    for (Iterator<Boolean> iterator = list.iterator(); iterator.hasNext(); ) {
	    	if (iterator.next()) {
	    		System.out.println("SUCCESS");
	    		break;
	    	}
	    }
    }
}
