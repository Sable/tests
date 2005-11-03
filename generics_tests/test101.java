public class test101<T>{
	private final T _data;
	private test101(T data){
		_data = data;
	}
	public T getData(){
		return _data;
	}
	public static <E> test101<E> create(E data) {
		return new test101<E>(data);
	}
	public static void main(String[] args) {
		create(new Object());
		System.out.println("SUCCESS");
	}
}
