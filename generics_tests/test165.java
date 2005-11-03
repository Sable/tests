public class test165<T> {
	T element;
	test165(T element) { this.element = element; }
	T element() { return this.element; }
	public static void main(String[] args) {
		new test165<test165B>(new test165B()).element().afoo();
	}
}

class test165A {
	void afoo() {
		System.out.println("SUCCESS");
   }
}
class test165B extends test165A {
	void bfoo() {}
}
