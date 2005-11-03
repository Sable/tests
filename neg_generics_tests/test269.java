class Super<S> {
	class A<E> { }
	<T> void take(A<S> o) {
	}
}
class Sub extends Super<Double> {
	void test() {
		take(new A());
	}
}
public class test269 {
	public static void main(String[] args) {
		new Sub().test();
		Zork z;
	}
}
