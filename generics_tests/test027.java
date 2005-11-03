public class test027 <T> extends A<T> {
    protected T t;
    test027(T t) {
        super(t);
        this.t = t;
    }
    public static void main(String[] args) {
	  test027<test027<String>> xs = new test027<test027<String>>(new test027<String>("SUCCESS"));
	  System.out.println(xs.t.t);
    }
}

class A<P> {
    protected P p;
    protected A(P p) {
       this.p = p; 
    } 
    protected void print(P p) {
        System.out.println("SUCCESS");
    }
}

