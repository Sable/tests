public enum test007 {
	
	BLEU(10) {
		String foo() { // inner
			return super.foo() + this.val;
		}
	},
	BLANC(20),
	ROUGE(30);

	int val;
	test007(int val) {
		this.val = val;
	}
	String foo() {  // outer
		return this.name();
	}
	public static void main(String[] args) {
		for(test007 x: values()) {
			System.out.print(x.foo());
		}
	}
}
