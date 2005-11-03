public class test045<T> {
  class Mtest045<U> {
  }

  public static void main(String[] args) {
    new test045<Thread>().foo(new test045<String>().new Mtest045<Thread>());
  }
  void foo(test045<String>.Mtest045<Thread> mx) {
	System.out.println("SUCCESS");
  }
}
