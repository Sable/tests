public class test041 <T extends Atest041> {
    T t;
    test041(T t){
        this.t = t;
    }
    public static void main(String[] args) {
		test041<? extends Atest041> x = new test041<Atest041<String>>(new Atest041<String>());
		x.t.foo("SUCCESS");
	}
}

class Atest041<P> {
   void foo(P p) { 
		System.out.println(p);
   }
}
