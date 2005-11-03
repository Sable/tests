public enum test012 {
	SUC, CESS;
	public static void main(String[] args) {
		for (test012 x : values()) {
			System.out.print(x.name());
		}
	}
}