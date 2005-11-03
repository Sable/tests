public class test010 <T extends Exception> {
    String foo() throws T {
        return "SUCCESS";
    }
    public static void main(String[] args) {
        new test010<Etest010>(new Etest010());
    }
    test010(final T t) {
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
class Etest010 extends Exception {
}
