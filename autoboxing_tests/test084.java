import java.util.ArrayList;
import java.util.List;

public class test084 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			list.add(i);
	    }
	    int sum = 0;
	    for (Integer i : list) {
	    	sum += i;
	    }
        System.out.print(sum);
    }
}