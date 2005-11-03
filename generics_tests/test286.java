public class test286 <T> {
    protected T t;
    test286(T t) {
        this.t = t;
    }
	T foo(T t1) {
		return t1;
    }
	T field;
    public static void main(String[] args) {
        System.out.print("SUCCESS");
    }
}