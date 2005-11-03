public class test102<T>{
	private final T _data;
	private test102(T data){
		_data = data;
	}
	public T getData(){
		return _data;
	}
	public static <E> E create(E data) {
		return new test102<E>(data)._data;
	}
	public static void main(String[] args) {
		create(new Object());
		System.out.println("SUCCESS");
	}
}
