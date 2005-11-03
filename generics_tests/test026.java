public class test026 <T> extends A<T> {
    protected T t;
    test026(T t) {
        super(t);
        this.t = t;
    }
    public static void main(String[] args) {
	  test026<String> xs = new test026<String>("SUCCESS");
	  System.out.println(xs.t);
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

