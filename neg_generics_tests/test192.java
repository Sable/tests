public class test192 extends Y {
	<T> T foo(Class<T> c) { return null; }
}
class Y {
	<T, S> T foo(Class<T> c) { return null; }
}