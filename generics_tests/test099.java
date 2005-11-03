public class test099 {
	public static void main(String[] args) {
		java.util.ArrayList<Object> i;	
		outer: {
			if (args == null) {
				i = null;
				break outer;
			}
			return;
		}
		System.out.println(i);	
		System.out.println("SUCCESS");	
	}
}
