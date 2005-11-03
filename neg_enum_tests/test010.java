public enum test010 { 
	
	BLEU(10),
	BLANC(),
	ROUGE(30);

	int val;
	test010(int val) {
		this.val = val;
	}

	public static void main(String[] args) {
		for(test010 x: values()) {
			System.out.print(x.val);
		}
	}
}
