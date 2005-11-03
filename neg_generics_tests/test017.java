public class test017 <T> {
    T t;
    test017() {
    }
    T foo(T a, T b) {
        T s;
        s = t = a;
		s = t += b;
		return t;
    }
    public static void main(String[] args) {
        System.out.println(new test017<String>().foo("SUC", "CESS"));
    }
}
