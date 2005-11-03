public class test284 <T extends Object & B> extends A<T> {
    protected T t;
    test284(T t) {
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

