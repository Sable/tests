public class test062 <T extends String> {
    T t;
    test062(T t){
        this.t = t;
    }
    public static void main(String[] args) {
		test062<? extends Atest062> x = new test062<Atest062<String>>(new Atest062<String>());
		x.t.foo("SUCCESS");
	}
}

class Atest062<P> {
   void foo(P p) { 
		System.out.println(p);
   }
}

