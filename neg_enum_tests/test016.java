public class test016 {
	enum Couleur { 
		BLEU, BLANC, ROUGE;
		static int C = 0;
		static void FOO() {}
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
			FOO();
			C++;
		}	
	}
}
