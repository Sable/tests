public class test169<T> {
	private T data;
	private test169(T data){ this.data=data; }
	public static <S> test169<S> createObject(S data){
		System.out.println(data);
		return new test169<S>(data);
	}
	public static void main(String[] args) {
		test169<String> res=test169.createObject("Hallo");
	}
}
