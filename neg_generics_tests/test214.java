public class test214 <T> {
    T t;
    test214(T t){
        this.t = t;
    }
    public static void main(String[] args) {
		test214<? extends Atest214> x = new test214<Atest214<Math>>(new Atest214<String>());
	}
}

class Atest214<P> {
    P foo() { return null; }
}
