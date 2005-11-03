public class test014 <T> {
    T t;
    test014(T t) {
        this.t = t;
    }
    public static void main(String[] args) {
        new test014<String>("OUTER").bar();
    }
    void bar() {
        new test014<String>("INNER") {
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
