public class test215<T> {
	static class TLM {
	}
    TLM getMap(TL t) {
        return t.tls;
    }
    static TLM createInheritedMap(TLM parentMap) {
        return new TLM();
    }  
}

class TL {
   test215.TLM tls = null;
}