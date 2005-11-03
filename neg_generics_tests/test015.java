public class test015 <T extends Exception> {
    test015(final T t) throws T {
        new Object() {
            void print() {
                System.out.println(t);
            }
        }.print();
    }
    public static void main(String[] args) {
        new test015<Etest015>(new Etest015());
    }
}
class Etest015 extends Exception {
}
