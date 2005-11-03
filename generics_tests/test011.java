public class test011 <E extends Exception> {
    void foo(E e) throws E {
        throw e;
    }
    test011(E e) {
        try {
            foo(e);
        } catch(Exception ex) {
	        System.out.println("SUCCESS");
        }
    }
    public static void main(String[] args) {
        new test011<Exception>(new Exception());
    }
}
