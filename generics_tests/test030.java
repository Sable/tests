package test;
public class test030<A extends X1<X2<X3<String>>>> {
	A a;
	public static void main(String[] args) {
		test030<X1<X2<X3<String>>>> x = new test030<X1<X2<X3<String>>>>();
		x.a = new X1<X2<X3<String>>>();
		x.a.a1 = new X2<X3<String>>();
		x.a.a1.a2 = new X3<String>();
		x.a.a1.a2.a3 = "SUCCESS";
		System.out.println(x.a.a1.a2.a3);
	}
}
class X1<A extends X2<X3<String>>> {
	A a1;
}
class X2<A extends X3<String>> {
	A a2;
}
class X3<A> {
	A a3;
}
