public class test035<T extends Exception & Itest035> {
    T t;
    void bar(T t) {
        t.getMessage();
        t.foo();
    }
    public static void main(String[] args) {
		test035 x = new test035();
		x.t.getMessage();
		x.t.foo();
	}
}

interface Itest035 {
    void foo();
}
