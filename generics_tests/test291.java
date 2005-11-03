public class test291<T> {
  class MX<U> {
  }

  public static void main(String[] args) {
    new test291<Thread>().foo(new test291<String>().new MX<Thread>());
  }
  void foo(test291<String>.MX<?> mx) {
	System.out.println("SUCCESS");
  }
}
