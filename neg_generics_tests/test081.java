public class test081<T extends Atest081> {
    T t;
    test081(T t) {
        this.t = t;
    }
    T get() {
        return this.t;
    }
    void bar(test081<? super Btest081> x) {
        x.get().afoo();
        x.get().bfoo();
    }
}
class Atest081 {
    void afoo() {}
}
class Btest081 extends Atest081 {
    void bfoo() {}
}
