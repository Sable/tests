import java.util.ArrayList;

public class test293<T> {
	
	public static void main(String[] args) {
		System.out.println("SUCCESS");
	}
	public <U> void foo(ArrayList<U> arr) {
		for (U e : arr) {
			System.out.println(e);
		}
	}
}