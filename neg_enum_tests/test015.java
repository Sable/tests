public class test015 {
	enum Couleur { BLEU, BLANC, ROUGE }
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
