public class test171<T extends Number> {
    T m;

    class Y<T> {
        void test() {
            new Y<Integer>() {
                void test() {
                    System.out.println(test171.this.m);
                }
            }.test();
        }
    }
}

