public class test282 {
	<T, U extends T, V extends T> T foo(U u, V v) {
		return this == null ? (T) u : (T)v;
	}
	Zork z;
}
