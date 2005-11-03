public class test034<T> extends p.A<T> {
    
    test034(T t) {
        super(t);
    }
    public static void main(String[] args) {
        test034 x = new test034(args);
        test034<String> xs = new test034<String>(args);
	}
}
