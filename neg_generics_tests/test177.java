import java.util.List;

public class test177 <E extends List & Runnable> {
	
	E element() { return null; }
	
	void bar(test177<E> xe) {
		xe.element().add(this);
		xe.element().run();
	}
	void foo(test177<?> xe) {
		xe.element().add(this);
		xe.element().run();
	}
	void baz(test177<? extends test177M> xe) {
		xe.element().add(this);
		xe.element().run();
	}
	abstract class test177M implements List, Runnable {}
  Zork z;
}
