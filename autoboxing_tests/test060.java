public class test060 {
	public static boolean foo() { return false; }
   public static void main(String[] s) {
		boolean b = foo();
      System.out.print(b || Boolean.FALSE);
   }
}