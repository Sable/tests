import java.util.HashMap;

public class test269 {

	static HashMap<Character, Character> substitutionList(String s1, String s2) {

		HashMap<Character, Character> subst = new HashMap<Character, Character>();

		for (int i = 0; i < s1.length(); i++) {
			char key = s1.charAt(i);
			char value = s2.charAt(i);
			if (subst.containsKey(key)) {
				if (value != subst.get(key)) {
					return null;
				}
			} else if (subst.containsValue(value)) {
				return null;
			} else {
				subst.put(key, value);
			}
		}

		return subst;
	}

	public static void main(String[] args) {
		System.out.println("SUCCESS");
	}
}
