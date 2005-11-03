public class test026 <T> {
    private T t;
    test026(T t) {
        this.t = t;
    }
    public static void main(String[] args) {
        new test026<String>("OUTER").bar();
    }
    void bar() {
        new Mtest026<String>("INNER") {
            void run() {
                
                new Object() {
                    void run() {
		                String s = t = "SUC";
		                s = t+= "CESS";
				        System.out.println(t);
                    }
                }.run();
            }
        }.run();
    }
}
class Mtest026<U> {
    Mtest026(U u){}
}
