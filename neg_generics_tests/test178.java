import java.util.List;

public class test178 <E extends List & Runnable> {
	
	E element() { return null; }
	
	void foo(test178<? extends test178I> xe) {
		xe.element().add(this);
		xe.element().run();
	}
	void baz(test178<? extends test178M> xe) {
		xe.element().add(this);
		xe.element().run();
	}
	interface test178I extends Runnable {}
	
	class test178M {
		void foo() {}
	}
  Zork z;
}
