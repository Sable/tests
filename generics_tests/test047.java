public class test047<T> {
  class Mtest047<U> {
  }

  public static void main(String[] args) {
    new test047<Thread>().foo(new test047<String>().new Mtest047<Thread>());
  }
  void foo(test047<?>.Mtest047<?> mx) {
	System.out.println("SUCCESS");
  }
}
