class U {
 static <T> T notNull(T t) { return t; }
}
public class test082 {
 void t() {
  String s = U.notNull("");
 }
 public static void main(String[] args) {
	new test082().t();
	System.out.println("SUCCESS");
}
}
