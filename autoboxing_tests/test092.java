import java.util.HashMap;

public class test092 {

	public static void main(String[] args) {
		HashMap<Character, Character> subst = new HashMap<Character, Character>();
		subst.put('a', 'a');
		if ('a' == subst.get('a')) {
			System.out.println("SUCCESS");
		}
	}
}
