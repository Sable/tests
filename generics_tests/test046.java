public class test046<T> {
  class Mtest046<U> {
  }

  public static void main(String[] args) {
    new test046<Thread>().foo(new test046<String>().new Mtest046<Thread>());
  }
  void foo(test046.Mtest046 mx) {
	System.out.println("SUCCESS");
  }
}
