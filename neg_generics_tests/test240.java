public class test240<A> {
  static class Inner<B> { 
  }

  void method() {
    test240<String>.Inner<Integer> d4 = new test240<String>.Inner<Integer>();
  }
}
