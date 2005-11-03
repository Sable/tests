public class test220 {

    public static <T> T first(T... args) {
        return args[0];
    }
    
    public static void main(String[] args) {
    	if (false) { 
    		String s = first(); 
    		int i; 
    		i++; 
    	}
        System.out.println(first("SUCCESS", "List"));
    }
   Zork z;
}