interface I {
   String foo();
}
interface J {
   Object foo();
}
 
public class test270 implements I {
   public String foo() {
 	return "";
   }
   public static void main(String[] args) {
         I i = new test270();
         try {
	        J j = (J) i;
         } catch(ClassCastException e) {
	        System.out.println("SUCCESS");
         }
  }
}
