public class test013 {
	
	enum Mtest013 { BLEU, BLANC, ROUGE }
	
	void foo(Mtest013 e) {
		switch(e) {
			case Mtest013.BLEU : break;
			case Mtest013.BLANC : break;
			case Mtest013.ROUGE : break;
		}
	}
}
