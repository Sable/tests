public class test174 {
    public static void main(String argv[]) {
        test1741<Integer> o = new test1741<Integer>(new Integer(4));
        System.out.println(o.get().t);
    }
}

class test1741<T> implements I<T> {
    T t;
    test1741(T arg) {
        t = arg;
    }
    public test1741 get() {
        return this;
    }
}    

interface I<T> extends K<T>, L<T> {
    I get();
}

interface J<T>  {
    J get();
}

interface K<T> extends J<T> {
}

interface L<T>  {
    K get();
}