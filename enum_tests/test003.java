public enum test003 { 
	
	BLEU,
	BLANC,
	ROUGE;
	
	public static void main(String[] args) {
		for(test003 x: test003.values()) {
			System.out.print(x);
		}
	}
	
}
