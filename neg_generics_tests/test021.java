public class test021 <E extends Cloneable, T extends Thread & Cloneable> {
	void foo(E e){}
	void foo(T t){}
	public static void main(String[] args) {
		test021<test021Y,test021Y> x = new test021<test021Y, test021Y>();
		x.foo(new test021Y());
	}
}
class test021Y extends Thread implements Cloneable {
}
