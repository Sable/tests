public class test238<A> {
  class Inner<B> { }

  void method() {
    test238<String>.Inner<Integer> d1 = new test238<String>.Inner<Integer>();
    test238.Inner d2 = new test238.Inner();
    test238.Inner<Integer> d3 = new test238.Inner<Integer>();
    d1 = d2;
    d2 = d1;
    d1 = d3;
    d3 = d1;
    d2 = d3;
    d3 = d2;

  }
}
