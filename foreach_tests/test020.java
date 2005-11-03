import java.util.ArrayList;

public class test020 {

    public static void main(String args[]) {
    	ArrayList<ArrayList<String>> slist = new ArrayList<ArrayList<String>>();
    	
    	slist.add(new ArrayList<String>());
    	slist.get(0).add("SU");
    	slist.get(0).add("C");
    	slist.get(0).add("C");
    	
    	slist.add(new ArrayList<String>());
    	slist.get(1).add("E");
    	slist.get(1).add("S");
    	slist.get(1).add("S");
    	
    	for (int i=0; i<slist.size(); i++){
    		for (String s : slist.get(i)){
    			System.out.print(s);
    		}
    	}
    } 
} 
