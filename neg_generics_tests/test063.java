public class test063 <T extends Atest063> {
    T t;
    test063(T t){
        this.t = t;
    }
    public static void main(String[] args) {
		test063<?> x = new test063<Btest063<String>>(new Btest063<String>());
		x.t.foo("SUCC");
		x.t.bar("ESS");
	}
}

class Atest063<P> {
   void foo(P p) { 
		System.out.print(p);
   }
}

class Btest063<Q> extends Atest063<Q> {
   void bar(Q q) { 
		System.out.println(q);
   }
}
