import p.A;
public class test049 {
    test049(A<String> a, A<String> b) {
    }
    void foo(A<String> a) {
    }
    public static void main(String[] args) {
        test049 x = new test049((A)null, (A)null);
        A a = new A((A)null);
		x.foo(a);
		a.print(x);
		A<String> as = new A<String>(null);
		as.print("hello");
	}
}
