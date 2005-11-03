class Y<T extends Number> {
}

public class test262 {
    public static void main(String argv[]) {
        m(new Y<Short>(), new Y<Integer>());
    }

    public static <T extends Number> void m(Y<T> x, Y<T> y) {
    }
}

