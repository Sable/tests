public class test016 {
	enum Couleur { 
		BLEU, BLANC, ROUGE; // take precedence over toplevel BLEU type
	}
	class Y implements Itest016, Jtest016 {
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

interface Itest016 {
	int BLEU = 1;
}
interface Jtest016 {
	int BLEU = 2;
}
class BLEU {}

