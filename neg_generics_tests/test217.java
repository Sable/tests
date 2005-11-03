public class test217 <T> {
	
	void foo(test217<? extends String> xs) {
		test217<String> x = (test217<String>) xs;
		Zork z;
	}
}
