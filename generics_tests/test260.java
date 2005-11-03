class Super<S> {
	class A<E> { }
	<T> void take(A<S> o) {
		System.out.println("SUCCESS");
	}
}
class Sub extends Super<Double> {
	void test() {
		take(new A());
	}
}
public class test260 {
	public static void main(String[] args) {
		new Sub().test();
	}
}
