public class test044<T> {
  class Mtest044<U> {
  }

  public static void main(String[] args) {
    new test044<Thread>().foo();
	System.out.println("SUCCESS");
  }
  void foo() {
		new test044<String>().new Mtest044<T>();
  }
}
