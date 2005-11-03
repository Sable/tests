public class test237<A> {
  class Inner<B> { }

  void method() {
    test237<String>.Inner<Integer> a= new test237<String>().new Inner<Integer>();
    Inner<Integer> b= new test237<A>().new Inner<Integer>();
    Inner<Integer> c= new Inner<Integer>();
    //OK for javac and eclipse

    test237<String>.Inner<Integer> d= new test237<String>.Inner<Integer>();
    //eclipse: OK
    //javac: error: '(' or '[' expected

    test237<A>.Inner<Integer> e= new test237<A>().new Inner<Integer>();
    test237<A>.Inner<Integer> f= new Inner<Integer>();
    e= b;
    f= c;
    //javac: OK
    //eclipse: Type mismatch: cannot convert from test237<A>.Inner<Integer> to test237<A>.Inner<Integer>

  }
}

class External {
  void m() {
    test237<String>.Inner<Integer> x= new test237<String>().new Inner<Integer>();
    //OK for javac and eclipse
  }
}
