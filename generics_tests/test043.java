public class test043 {
    Class k;
    public static void main(String args[]) {
        new test043().foo();
    }
    void foo() {
        Class c = this.getClass();
        this.k = this.getClass();
        this.k = Integer.class;
        try {
            Integer i = Integer.class.newInstance();
        } catch (Exception e) {
        }
        System.out.println("SUCCESS");
    }
}
