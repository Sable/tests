class U {
 static <T> T notNull(T t, V<T> vt) { return t; }
}
class V<T> {}

public class test083 {
 void t() {
  String s = U.notNull(null, new V<String>());
 }
 public static void main(String[] args) {
	new test083().t();
	System.out.println("SUCCESS");
}
}
