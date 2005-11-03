public class test148 {
	static <T> T foo(T t1, T t2){ return t1; }
	public static void main(String[] args) {
		Itest148 s = null;
		 foo(new Object(), s);
	}
}
interface Itest148 {}
