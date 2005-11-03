 public class test104 <T extends test104C> {
 	T.Mtest104C f;
 	public static void main(String[] args) {
		System.out.println("SUCCESS");
	}
 }

 class test104C {
 	class Mtest104C {}
 }
