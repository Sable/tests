public class test013 <T> {
     void foo(Y<T> y) {
		System.out.print("SUCC");
    }
    public static void main(String[] args) {
        new test013<String>().bar();
    }
    void bar() {
        new Y<T>() {
            @Override
            public void pre() {
                foo(this);
            }
        }.print("ESS");
    }
}
class Y <P> {
	public void print(P p) {
		pre();
		System.out.println(p);
	}
	public void pre() {
	}
}