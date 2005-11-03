public class test128 <T extends Exception> {
    String foo() throws T {
        return "SUCCESS";
    }
    public static void main(String[] args) {
        new test128<Etest128>().baz(new Etest128());
    }
    void baz(final T t) {
        new Object() {
            void print() {
                try {
	                System.out.println(foo());
                } catch (T t) {
                }
            }
        }.print();
    }
}
class Etest128 extends Exception {
}
