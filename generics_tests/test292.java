public class test292<T> {
  class MX<U> {
  }

  public static void main(String[] args) {
    new test292<Thread>().foo(new test292<String>().new MX<Thread>());
  }
  void foo(test292.MX mx) {			// no signature
	System.out.println("SUCCESS");
  }
}
