public class test218 <E> {
	
	<T> void foo(test218<test218<T>> xs) {
		test218<test218<String>> x = (test218<test218<String>>) xs;
	}
	<T> void bar(test218<T> xs) {
		test218<String> x = (test218<String>) xs;
	}	
}
