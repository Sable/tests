import java.io.IOException;

public class test036<T extends Exception> {

    public static void main(String[] args) {
		test036 x = new test036();
		test036<IOException> xioe = new test036<IOException>(); // ok
		
		test036 x2 = xioe;
		test036<IOException> xioe2 = x; // unsafe
	}
}
