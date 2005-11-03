public class test014 {
	enum Couleur { 
		BLEU, BLANC, ROUGE; // take precedence over toplevel BLEU type
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
