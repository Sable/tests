public class test217 {
    public S<M.E<Object,Object>> foo(HM hm) {
		return C.bar(hm).foo();
    }
}
class C {
    public static <K,V> M<K,V> bar(M<? extends K,? extends V> m) {
		return null;
    }
}
class S<E> {
}
abstract class HM<U,V> implements M<U,V>{
}
interface M<A,B> {
	static class E<S,T> {}
	S<E<A,B>> foo();	
}
