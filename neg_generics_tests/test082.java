public class test082<T extends Atest082> {
    T t;
    test082(T t) {
        this.t = t;
    }
    T get() {
        return this.t;
    }
    void bar(test082<? extends test082> x) {
        x = identity(x);
    }
    <P extends Atest082> test082<P> identity(test082<P> x) {
        return x;
    }
    public static void main(String[] args) {
    }
}
class Atest082 {
    void afoo() {}
}
class Btest082 extends Atest082 {
    void bfoo() {}
}
