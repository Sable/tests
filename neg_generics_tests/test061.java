public class test061 <T> {
    T t;
    test061(T t){
        this.t = t;
    }
    public static void main(String[] args) {
		test061<? extends Atest061> x = new test061<? extends Atest061>(new Atest061<String>());
		System.out.println("SUCCESS");
	}
}

class Atest061<P> {
    P foo() { return null; }
}
