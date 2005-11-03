public class test287 <T> {
    protected T t;
    test287(T t) {
        this.t = t;
    }
	T foo(test287<T> x1) {
		return x1.t;
    }
	test287<T> field;
    public static void main(String[] args) {
        System.out.print("SUCCESS");
    }
}
