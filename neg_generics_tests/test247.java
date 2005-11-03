import java.util.*;

public class test247 {

	public <E extends Object, S extends Collection<E>> S test(S param) {
		
		Class<? extends Collection> c = param.getClass(); // ok
		Class<? extends Collection> d = getClazz(); // ko
		return null;
	}
	Class<? extends Object> getClazz() {
		return null;
	}
}
abstract class Z implements Collection<String> {
	void foo() {
		Class<? extends Collection> c = getClass(); // ok
	}
}
