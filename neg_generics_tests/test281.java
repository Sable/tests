public class test281 {
    Zork z;
    <T> T f(Object o) {
	return (T) o; // OK
    }

    <U, T extends U> T g(Object o) {
	return (T) o; // bug???
    }

    <U, T extends U> T h(Object o) {
	return test281.<T>castTo(o); // workaround
    }

    private static <T> T castTo(Object o) {
	return (T) o;
    }
}
