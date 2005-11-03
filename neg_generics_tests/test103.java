public class test103<E> {
    test103<E> foo() {
    	return (test103<E>) this;
    }
    test103<String> bar() {
    	return (Atest103<String>) new test103<String>();
    }
    test103<String> bar(Object o) {
    	return (Atest103<String>) o;
    }
    test103<E> foo(Object o) {
    	return (Atest103<E>) o;
    }    
    test103<E> baz(Object o) {
    	return (Atest103<E>) null;
    }
    test103<String> baz2(Btest103 bx) {
    	return (test103<String>) bx;
    }    
}
class Atest103<F> extends test103<F> {}
class Btest103 extends Atest103<String> {}
