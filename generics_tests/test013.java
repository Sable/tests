public class test013 <T> {
    T t;
    test013() {
    }
    T foo(T a) {
        T s;
        s = t = a;
		return t;
    }
    public static void main(String[] args) {
        System.out.println(new test013<String>().foo("SUCCESS"));
    }
}
