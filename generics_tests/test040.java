public class test040 <T extends Atest040> {
    T t;
    test040(T t){
        this.t = t;
    }
    public static void main(String[] args) {
		test040<? extends Btest040> x = new test040<Btest040<String>>(new Btest040<String>());
		x.t.foo("SUCC");
		x.t.bar("ESS");
	}
}

class Atest040<P> {
   void foo(P p) { 
		System.out.print(p);
   }
}

class Btest040<Q> extends Atest040<Q> {
   void bar(Q q) { 
		System.out.println(q);
   }
}
