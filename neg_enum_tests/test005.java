public enum test005 { 
	
	BLEU,
	BLANC,
	ROUGE;
	
   void dup() {} 
   void values() {} 
   void dup() {} 
   void values() {} 
   Missing dup() {} 
	public static void main(String[] args) {
		for(test005 x: test005.values()) {
			System.out.print(x);
		}
	}
	
}
