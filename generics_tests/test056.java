public class test056 {
    
    <W> void foo(Atest056<W> aw) {
        System.out.println("SUCCESS");
     }
    
    public static void main(String[] args) {
		new test056().foo(new Ctest056());
	}
}

class Atest056<T> {
}
class Btest056<U, V> extends Atest056<V> {
}
class Ctest056 extends Btest056<String, Thread> {
}
