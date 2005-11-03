public enum test030 {
	A, B, C;
	public static final test030 D = null;
}

class A {
	private void foo(test030 x) {
		switch (x) {
			case D:
		}
	}
}
