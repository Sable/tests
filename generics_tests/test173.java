public class test173 {
    public static void main(String argv[]) {
       test1731<Integer> o1 = new test1731<Integer>(new Integer(4));
        System.out.println(o1.get().t);
    }
}

class test1731<T> implements I<T> {
    T t;
    test1731(T arg) {
        t = arg;
    }
    public test1731 get() {
        return this;
    }
}

interface I<T> extends J<T> {
    I get();
}

interface J<T>  {
    J get();
}