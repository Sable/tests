public class test102 <T> {
	
	T foo(T t) {
		if (t instanceof test102<T>) {
			return t;
		} else if (t instanceof test102<String>) {
			return t;
		} else if (t instanceof test102<?>) {
			return t;
		} else 	if (t instanceof T) {
			return t;
		} else if (t instanceof test102) {
			return t;
		}
		return null;
	}
}
