public class test015 <T> {
    T t;
    test015(T t) {
        this.t = t;
    }
    public static void main(String[] args) {
        new test015<String>("OUTER").bar();
    }
    void bar() {
        new test015<String>("INNER") {
            void run() {
                String s = t = "SUC";
                s = t+= "CESS";
		        System.out.println(t);
            }
        }.run();
    }
}
