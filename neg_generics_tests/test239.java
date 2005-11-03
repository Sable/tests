public class test239<A> {
  class Inner<B> { 
  }

  void method() {
    test239<String>.Inner<Integer> d4 = new test239.Inner<Integer>();
  }
}
