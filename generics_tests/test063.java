public class test063<T extends Atest063> {
    T t;
    test063(T t) {
        this.t = t;
    }
    T get() {
        return this.t;
    }
    void bar(test063<? extends Btest063> x) {
        x.get().afoo();
        x.get().bfoo();
    }
    public static void main(String[] args) {
        System.out.println("SUCCESS");
	}
}
class Atest063 {
    void afoo() {}
}
class Btest063 extends Atest063 {
    void bfoo() {}
}
