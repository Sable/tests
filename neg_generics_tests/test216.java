public class test216 <T> {
	
	void foo(test216<test216<? extends String>> xs) {
		test216<test216<String>> x = (test216<test216<String>>) xs;
		Zork z;
	}
}
