public class test263 <T extends Atest263> {
    T t;
    test263(T t){
        this.t = t;
    }
    public static void main(String[] args) {
		test263<? extends Btest263> x = new test263<Btest263<String>>(new Btest263<String>());
		System.out.print(x.self().t.ax);
		System.out.print(x.self().t.bx);
	}
	test263<T> self() {
		return this;
	}
}

class Atest263<P> {
	P ax;
}

class Btest263<Q> extends Atest263<Q> {
	Q bx;
}
