public class test062 <T extends AX> {
    T t;
    test062(T t){
        this.t = t;
    }
    public static void main(String[] args) {
		 test062<AX<String>> zax = new test062<AX<String>>(new AX<String>());
        System.out.println("SUCCESS");
	}
    void baz(test062<?> zu){
        zu.t.foo(null);
    }
}

class AX<P> {
   void foo(P p) { 
		System.out.print(p);
   }
}
