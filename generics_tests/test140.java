import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test140 {
		 public static void main(String[] args) {
		 		 Map<String, String> map = new HashMap<String, String>();
		 		 
		 		 map.put("foo", "bar");
		 		 
		 		 // Error reported on the following line
		 		 Iterator<Map.Entry<String,String>> i = map.entrySet().iterator();
		 		 while (i.hasNext()) {
		 		 		 Map.Entry<String, String> entry = i.next();
		 		 		 System.out.println(entry.getKey() + ", " + entry.getValue());
		 		 }
		 }
}
