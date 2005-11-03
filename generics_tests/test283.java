public class test283 <T extends Object & B<? super T>> extends A<T> {
    protected T t;
    test283(T t) {
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

