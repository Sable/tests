public enum test006 {
	
	BLEU,
	BLANC,
	ROUGE;
	
	//void values() {}
	
	public static void main(String[] args) {
		test006 x = BLEU;
		switch(x) {
			case BLEU :
				break;
			case BLEU :
			case BLANC :
			case ROUGE :
				System.out.println("FAILED");
				break;
		}
	}
	
}