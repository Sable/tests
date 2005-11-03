public class test030 <T> extends p.A<T> {
    protected T t;
    test030(T t) {
        super(t);
        this.t = t;
    }
    public static void main(String[] args) {
	  test030<String> xs = new test030<String>("SUCCESS");
	  System.out.println((test030)xs.t);
    }
}
