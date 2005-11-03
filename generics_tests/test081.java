class U {
 static <T> T notNull(T t) { return t; }
}
public class test081 {
 void t() {
  String s = U.notNull(null);
 }
 public static void main(String[] args) {
	new test081().t();
	System.out.println("SUCCESS");
}
}
