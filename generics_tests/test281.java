public class test281 <T> extends A<T> {
    protected T t;
    test281(T t) {
        super(t);
        this.t = t;
    }
    public static void main(String[] args) {
    	test281<test281<String>> xs = new test281<test281<String>>(new test281<String>("SUCCESS"));
        System.out.print(xs.t.t);
    }
}
class A<P> {
    protected P p;
    protected A(P p) {
        this.p = p;
    }
}

