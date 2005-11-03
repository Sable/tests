public class test054 {
    test054(Atest054<String> a, Atest054<String> b) {
    }
    void foo(Atest054<String> a) {
    }
    public static void main(String[] args) {
        test054 x = new test054((Atest054)null, (Atest054)null);
        Atest054 a = new Atest054((Atest054)null);
        Atest054 a2 = new Atest054(null);
		x.foo(a);
		a.foo(a);
		a.bar(a);
		Atest054<String> as = new Atest054<String>(null);
		as.print(a);
		as.bar(a);
	}
}
class Atest054 <P> {
    Atest054(Atest054<P> ax){}
    Atest054(P p){}
    void print(P p){}
    void foo(Atest054 rawAx){}
    void bar(Atest054<P> ax){}
}
