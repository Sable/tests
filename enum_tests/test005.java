public enum test005 {
	
	BLEU,
	BLANC,
	ROUGE;
	
	//void values() {}
	
	public static void main(String[] args) {
		test005 x = BLEU;
		switch(x) {
			case BLEU :
				System.out.println("SUCCESS");
				break;
			case BLANC :
			case ROUGE :
				System.out.println("FAILED");
				break;
		}
	}
	
}