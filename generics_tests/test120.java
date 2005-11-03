public class test120 <E> {
	void bar() {
		test120<? extends E> xe = new test120<E>();
	}
}
