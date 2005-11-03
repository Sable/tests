public class test211<T extends Exception> {
	T element;
	
	void foo(test211<? super NullPointerException> xnpe) {
		xnpe.element = new java.io.IOException();
	}
}
