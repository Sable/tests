enum test028 { a }
class A {
	public static void main(String[] args) {
		test(test028.a, 9);
		test2(test028.a, 3);
	}
	static void test(test028 x, int a) {
		if (x == a) a++; // incomparable types: test028 and int
		switch(x) {
			case a : System.out.println(a); // prints '9'
		}
	}
	static void test2(test028 x, final int aa) {
		switch(x) {
			case aa : // unqualified enum constant error
				System.out.println(a); // cannot find a
		}
	}
}
