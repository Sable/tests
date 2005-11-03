public enum test031 {
	A, B, C;
	public static final test031 D = null;
}

class A {
	private void foo(test031 x) {
		switch (x) {
			case test031.D:
		}
	}
}
