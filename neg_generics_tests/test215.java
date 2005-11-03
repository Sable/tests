public class test215 <T> {
    T t;
    test215(test215<? extends T> xt){
        this.t = xt.t;
    }
    public static void main(String[] args) {
		test215<? extends Atest215> x = new test215<Atest215<Math>>(new test215<Atest215<String>>(null));
	}
}
class Atest215<P> {
    P foo() { return null; }
}