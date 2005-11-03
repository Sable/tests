import java.util.*;
public class test213 {
    public Number getTypes() {
        List<Integer> list = new ArrayList<Integer>();
        return list == null 
            ? Float.valueOf(0)
            : list.get(0);
    }
    public static void main(String[] args) {
        Class clazz = null;
        try {
            clazz = Class.forName("test213");
    	     System.out.println("SUCCESS");
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}