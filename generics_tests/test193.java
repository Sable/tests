public class test193 <T extends Exception> {

	void foo1(test193 <? extends Exception> target, test193<?> value) {
		target = value; // foo1
	}
	void foo2(test193 <? extends Exception> target, test193<? super RuntimeException> value) {
		target = value;  // foo2
	}	
}
