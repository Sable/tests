public class test127<T> implements I {
    public Class<T> getDeclaringClass() { return null; }
}
class Y implements I {
    public Class<?> getDeclaringClass() { return null; }
}
interface I {
	public Class getDeclaringClass();
}
