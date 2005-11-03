public class test048<T> extends p.A<T> {
	 test048() {
		super(null);
	}
    test048(T t) {
        super(t);
    }
    test048(test048<T> xt) {
        super(xt.t);
    }
    public static void main(String[] args) {
        test048 x = new test048();
        test048 x1 = new test048(args);
        test048 x2 = new test048(x);
        test048<String> xs = new test048<String>(args);
	}
}
