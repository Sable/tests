public class test005 <T extends Exception> {
    String foo() throws T {
        return "SUCCESS";
    }
    public static void main(String[] args) {
        new test005<Etest005>().baz(new Etest005());
    }
    void baz(final T t) {
        new Object() {
            void print() {
                try {
	                System.out.println(foo());
                } catch (Exception t) {
                }
            }
        }.print();
    }
}
class Etest005 extends Exception {
}
