public class test297<T> {
  static class MX<U> {
  }

  public static void main(String[] args) {
    new test297<Thread>().foo(new MX<Thread>());
  }
  void foo(test297.MX<?> mx) {
	System.out.println("SUCCESS");
  }
}
