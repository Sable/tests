public class test042 <T extends Atest042> {
    T t;
    test042(T t){
        this.t = t;
    }
    public static void main(String[] args) {
        test042<Btest042<String>> x = new test042<Btest042<String>>(new Btest042<String>());
		x.t.foo("SUCC");
		x.t.bar("ESS");
	}
}

class Atest042<P> {
   void foo(P p) { 
		System.out.print(p);
   }
}

class Btest042<Q> extends Atest042<Q> {
   void bar(Q q) { 
		System.out.println(q);
   }
}
