public class test241<A> {
  class Inner<B> { 
  }

  void method() {
    test241<String>.Inner<Integer> d4 = new test241<String>.Inner<Integer>() {};
  }
}
