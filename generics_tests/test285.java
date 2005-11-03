public class test285 <T extends Object & B & C> extends A<T> {
    protected T t;
    test285(T t) {
        super(t);
        this.t = t;
    }
}
class A<P> {
    protected P p;
    protected A(P p) {
        this.p = p;
    }
}
interface B<T> {}
interface C<T> {}
