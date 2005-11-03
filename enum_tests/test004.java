public enum test004 { 
	
	BLEU,
	BLANC,
	ROUGE;
	
   int $VALUES;
	public static void main(String[] args) {
		for(test004 x: test004.values()) {
			System.out.print(x);
		}
	}
	
}
