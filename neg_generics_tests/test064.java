public class test064 <T extends Atest064> {
    T t;
    test064(T t){
        this.t = t;
    }
    public static void main(String[] args) {
		test064<? extends Btest064> x = new test064<Atest064<String>>(new Atest064<String>());
		x.t.foo("SUCC");
		x.t.bar("ESS");
	}
}

class Atest064<P> {
   void foo(P p) { 
		System.out.print(p);
   }
}

class Btest064<Q> extends Atest064<Q> {
   void bar(Q q) { 
		System.out.println(q);
   }
}
