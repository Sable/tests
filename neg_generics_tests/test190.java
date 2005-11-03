public class test190 extends Y {
	<T, S> S foo(Class<S> c) { return null; }
}
class Y {
	<S, T> S foo(Class<S> c) { return null; }
}