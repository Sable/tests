public class test060  <T extends Atest060<? super int>> {
    public static void main(String[] args) {
		Atest060<String> ax;
		System.out.println("SUCCESS");
	}
	void foo(test060<?> x) {
	}
}

class Atest060<P> {
}
