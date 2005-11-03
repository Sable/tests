import java.util.*;

public class test240 {
	
	 public <E extends Object, S extends Collection<E>> S test1(S param){
	 	System.out.println("SUCCESS");
	 	return null;
	 }
	 
	 public void test2() {
	 	test1(new Vector<String>());
	 }

	 public static void main(String[] args) {
		new test240().test2();
	}
}
