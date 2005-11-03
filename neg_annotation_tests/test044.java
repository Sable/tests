@interface I {
	int id default 0;
}

@I() public class test044 {
	public static void main(String[] s) {
		System.out.println(X.class.getAnnotation(I.class));
	}
}