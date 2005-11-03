import java.util.*;

public class test096<T>{
    public static void main(String [] args) {
        System.out.println("SUCCESS");
    }
	test096<T> _recurse; 
	public List<T> toList(){
		List<T> result = new ArrayList<T>();
		result.addAll(_recurse.toList()); // should be applicable
		return result;
	}
}
