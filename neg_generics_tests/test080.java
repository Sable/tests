public class test080<T extends Atest080> {
    T t;
    test080(T t) {
        this.t = t;
    }
    T get() {
        return this.t;
    }
    void bar(test080<? extends Btest080> x) {
        x.get().afoo();
        x.get().bfoo();
    }
}
class Atest080 {
    void afoo() {}
}
class Btest080 {
    void bfoo() {}
}
