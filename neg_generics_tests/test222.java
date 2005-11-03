public class test222 {

    static <T extends test222> T bar() {
        return null;
    }
    static <U extends test222&Runnable> U foo() {
        return null;
    }

    public static void main(String argv[]) {
    	bar();
        foo();
    }

}