public class test073 {
    
    <W> void foo(Atest073<W> aw) {
        System.out.println("SUCCESS");
     }
    
    public static void main(String[] args) {
		new test073().foo(new Ctest073());
	}
}

class Atest073<T> {
}
class Btest073<U, V> extends Atest073<V> {
}
class Ctest073 extends B<String, Thread> {
}
