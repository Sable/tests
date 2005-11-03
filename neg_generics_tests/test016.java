import java.io.IOException;
public class test016 <E extends Exception> {
    void foo(E e) throws E {
        throw e;
    }
    test016(E e) {
        try {
            foo(e);
        } catch(Exception ex) {
	        System.out.println("SUCCESS");
        }
    }
    public static void main(String[] args) {
        new test016<IOException>(new Exception());
    }
}
