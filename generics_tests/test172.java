public class test172 {
    public static void main(String argv[]) {
       test1721<Integer> o1 = new test1721<Integer>();
        ((J<Integer>)o1).get();
    }
}

class test1721<T> implements I<T> {
    public test1721 get() {
    	System.out.println("SUCCESS");
        return this;
    }
}

interface I<T> extends J<T> {
    I get();
}

interface J<T>  {
    J get();
}