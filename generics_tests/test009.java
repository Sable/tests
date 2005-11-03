public class test009 <T extends String> {
    test009(final T t) {
        new Object() {
            void print() {
                System.out.println(t);
            }
        }.print();
    }
    public static void main(String[] args) {
        new test009<String>("SUCCESS");
    }
}
