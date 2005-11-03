public class test262 <T extends Atest262> {
    T t;
    test262(T t){
        this.t = t;
    }
    public static void main(String[] args) {
		test262<? extends Btest262> x = new test262<Btest262<String>>(new Btest262<String>());
		System.out.print(x.t.ax);
		System.out.print(x.t.bx);
	}
}

class Atest262<P> {
	P ax;
}

class Btest262<Q> extends Atest262<Q> {
	Q bx;
}
