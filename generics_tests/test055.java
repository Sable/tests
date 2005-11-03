public class test055 {
    
    <W> void foo(Atest055<W> aw) {
        System.out.println("SUCCESS");
     }
    
    public static void main(String[] args) {
		new test055().foo(new Btest055<String,Thread>());
	}
}

class Atest055<T> {
}
class Btest055<U, V> extends Atest055<V> {
}
