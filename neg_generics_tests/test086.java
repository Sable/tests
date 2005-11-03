import java.util.*;
public class test086 {
    
    <T extends test086> void foo(T[] ta, List<T> lt) {
    }
    
    public static void main(String[] args) {
		new test086().foo(args, new ArrayList<String>());
	}
}
