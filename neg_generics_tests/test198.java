public class test198 <T> {

	void foo1(test198 <? super Exception> target, test198<? extends Exception> value) {
		target = value; // foo1
	}
}
