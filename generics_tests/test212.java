import java.util.*;
public class test212 {
    public Integer[] getTypes() {
        List<Integer> list = new ArrayList<Integer>();
        return list == null 
            ? new Integer[0] 
            : list.toArray(new Integer[list.size()]);
    }
    public static void main(String[] args) {
        Class clazz = null;
        try {
            clazz = Class.forName("test212");
    	     System.out.println("SUCCESS");
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}