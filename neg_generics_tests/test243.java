public class test243<T, U extends test243> {
	Object[] objectArr;
	void foo(T t) {
		T x1= (T) objectArr;
		U x2= (U) objectArr;
		int[] x= (int[]) t;
	}
}
