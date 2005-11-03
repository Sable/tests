public class test015 {
	enum Couleur { 
		BLEU, BLANC, ROUGE; // take precedence over sibling constant from Color
	}
	enum Color { 
		BLEU, BLANC, ROUGE;
	}
	class Y {
		void foo(Couleur c) {
			switch (c) {
				case BLEU :
					break;
				case BLANC :
					break;
				case ROUGE :
					break;
			}
		}	
	}
}

class BLEU {}
