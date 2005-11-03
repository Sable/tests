public abstract class test210<K1,V1> implements M<K1,V1> {
	abstract M<K1,V1> other();
	public S<E<K1,V1>> entrySet() {
		return other().entrySet();
	}
}
interface M<K2,V2> {
	 interface E<K3,V3> { }
	 S<E<K2, V2>> entrySet();
}
interface S<T> {}