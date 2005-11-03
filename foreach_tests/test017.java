import java.util.List;
import java.util.ArrayList;

public class test017 {
	public static void bug(List<String> lines) {
        for (int i=0; i<1; i++) {
           for (String test: lines) {
                System.out.print(test);
           }
        }
    }
    public static void main(String[] args) {
    	ArrayList<String> tab = new ArrayList<String>();
    	tab.add("SUCCESS");
    	bug(tab);
    }
}