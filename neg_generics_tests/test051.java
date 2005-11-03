package test;
public class X<A extends X1<X2<X3<String>> {}
class X1<A extends X2<X3<String> {}
class X2<A extends X3<String {}
class X3<A> {}
