public enum test006 { 
	
	BLEU(10),
	BLANC(20),
	ROUGE(30);

	int val;
	test006(int val) {
		this.val = val;
	}

	public static void main(String[] args) {
		for(test006 x: values()) {
			System.out.print(x.val);
		}
	}
}
