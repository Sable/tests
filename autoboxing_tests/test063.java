public class test063 {
	public static Boolean bar() { return Boolean.TRUE; } 
	public static void main(String[] args) {
		Integer i = bar() ? new Integer(1) : null;
		int j = i;
		System.out.print(j);
	}
}